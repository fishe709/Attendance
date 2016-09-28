package cn.itkt.hotel.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 类: AESUtil <br>
 * 描述: 手机端酒店预订的时候加密方式 <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-5-23 上午10:34:56
 */
public class AESUtil {

	public static final byte[] VIPARA = { 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 };
	public static final String bm = "UTF-8";

	public static String enctyptToString(String cleartext, String dataPassword) {
		if (cleartext != null) {
			IvParameterSpec zeroIv = new IvParameterSpec(VIPARA);
			byte[] encryptedData;
			try {
				SecretKeySpec key = new SecretKeySpec(dataPassword.getBytes(bm), "AES");
				Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
				//			Cipher cipher = Cipher.getInstance("ECB/PKCS5Padding");
				cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
				encryptedData = cipher.doFinal(cleartext.getBytes(bm));
				return AESUtil.encode(encryptedData);
			} catch (InvalidKeyException e) {
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (NoSuchPaddingException e) {
				e.printStackTrace();
			} catch (InvalidAlgorithmParameterException e) {
				e.printStackTrace();
			} catch (IllegalBlockSizeException e) {
				e.printStackTrace();
			} catch (BadPaddingException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static String decryptToString(String encrypted, String dataPassword) {
		if (encrypted != null) {
			byte[] byteMi = AESUtil.decode(encrypted);
			IvParameterSpec zeroIv = new IvParameterSpec(VIPARA);
			SecretKeySpec key = new SecretKeySpec(dataPassword.getBytes(), "AES");
			try {
				Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
				cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
				byte[] decryptedData = cipher.doFinal(byteMi);
				return new String(decryptedData, bm);
			} catch (InvalidKeyException e) {
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (NoSuchPaddingException e) {
				e.printStackTrace();
			} catch (InvalidAlgorithmParameterException e) {
				e.printStackTrace();
			} catch (IllegalBlockSizeException e) {
				e.printStackTrace();
			} catch (BadPaddingException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private static final char[] legalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

	/**
	 * data[]进行编码
	 * @param data
	 * @return
	 */
	public static String encode(byte[] data) {
		int start = 0;
		int len = data.length;
		StringBuffer buf = new StringBuffer(data.length * 3 / 2);

		int end = len - 3;
		int i = start;
		int n = 0;

		while (i <= end) {
			int d = ((((int) data[i]) & 0x0ff) << 16) | ((((int) data[i + 1]) & 0x0ff) << 8) | (((int) data[i + 2]) & 0x0ff);

			buf.append(legalChars[(d >> 18) & 63]);
			buf.append(legalChars[(d >> 12) & 63]);
			buf.append(legalChars[(d >> 6) & 63]);
			buf.append(legalChars[d & 63]);

			i += 3;

			if (n++ >= 14) {
				n = 0;
				buf.append(" ");
			}
		}

		if (i == start + len - 2) {
			int d = ((((int) data[i]) & 0x0ff) << 16) | ((((int) data[i + 1]) & 255) << 8);

			buf.append(legalChars[(d >> 18) & 63]);
			buf.append(legalChars[(d >> 12) & 63]);
			buf.append(legalChars[(d >> 6) & 63]);
			buf.append("=");
		} else if (i == start + len - 1) {
			int d = (((int) data[i]) & 0x0ff) << 16;

			buf.append(legalChars[(d >> 18) & 63]);
			buf.append(legalChars[(d >> 12) & 63]);
			buf.append("==");
		}

		return buf.toString();
	}

	private static int decode(char c) {
		if (c >= 'A' && c <= 'Z')
			return ((int) c) - 65;
		else if (c >= 'a' && c <= 'z')
			return ((int) c) - 97 + 26;
		else if (c >= '0' && c <= '9')
			return ((int) c) - 48 + 26 + 26;
		else
			switch (c) {
			case '+':
				return 62;
			case '/':
				return 63;
			case '=':
				return 0;
			default:
				throw new RuntimeException("unexpected code: " + c);
			}
	}

	/**
	 * Decodes the given Base64 encoded String to a new byte array. The byte array holding the decoded data is returned.
	 */
	public static byte[] decode(String s) {

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			decode(s, bos);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		byte[] decodedBytes = bos.toByteArray();
		try {
			bos.close();
			bos = null;
		} catch (IOException ex) {
			System.err.println("Error while decoding BASE64: " + ex.toString());
		}
		return decodedBytes;
	}

	private static void decode(String s, OutputStream os) throws IOException {
		int i = 0;
		int len = s.length();

		while (true) {
			while (i < len && s.charAt(i) <= ' ')
				i++;

			if (i == len)
				break;

			int tri = (decode(s.charAt(i)) << 18) + (decode(s.charAt(i + 1)) << 12) + (decode(s.charAt(i + 2)) << 6)
					+ (decode(s.charAt(i + 3)));

			os.write((tri >> 16) & 255);
			if (s.charAt(i + 2) == '=')
				break;
			os.write((tri >> 8) & 255);
			if (s.charAt(i + 3) == '=')
				break;
			os.write(tri & 255);

			i += 4;
		}
	}

//	public static void main(String[] args) {
//		try {
//			String content = "6222300193685533";
//			String key = "2012082317108212";
//			String tmp = AESUtil.enctyptToString(content, key);
//
//			//			iFz3aDR/O5AMPhrxzRxe/lEd2O1U6prauVeX8zJAGws=
//			System.out.println(tmp);//EwKP7VUXQZNeMRgyB0saRw== 
//			//			String tmp="Ul5UUItixXgK4XOkKmX1Jh5tc+dgP3+7GBktgwZHGh4=";
//			System.out.println(AESUtil.decryptToString(tmp, key));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
