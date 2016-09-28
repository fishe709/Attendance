package cn.itkt.hotel.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.junit.Test;

/**
 * zip压缩工具
 * @author jixf
 * @version 1.0 , 2013-3-6 下午04:37:32
 */
public class ZipUtils {

	public static final String EXT = ".zip";
	private static final String BASE_DIR = "";
	// 符号"/"用来作为目录标识判断符  
	private static final String PATH = "/";
	private static final int BUFFER_SIZE = 1024;

	@Test
	public void test() throws IOException {
		String srcPath = "E:/elongli/images/00101006/default.jpg";
		ZipUtils.compress(srcPath, "E:/xxx.zip");
	}

	/**
	 * 压缩
	 * @param srcFile
	 * @throws IOException
	 */
	public static void compress(File srcFile) throws IOException {
		String name = srcFile.getName();
		String basePath = srcFile.getParent();
		String destPath = basePath + name + EXT;
		compress(srcFile, destPath);
	}

	/**
	 * 压缩
	 * @param srcFile 原路径
	 * @param destFile 目标路径
	 * @throws IOException
	 */
	public static void compress(File srcFile, File destFile) throws IOException {
		// 对输出文件做CRC32校验  
		CheckedOutputStream cos = new CheckedOutputStream(new FileOutputStream(destFile), new CRC32());
		ZipOutputStream zos = new ZipOutputStream(cos);
		compress(srcFile, zos, BASE_DIR);
		zos.flush();
		zos.close();
	}

	/**
	 * 压缩文件
	 * @param srcFile
	 * @param destPath
	 * @throws IOException
	 */
	public static void compress(File srcFile, String destPath) throws IOException {
		compress(srcFile, new File(destPath));
	}

	/**
	 * 压缩
	 * @param srcFile 源路径
	 * @param zos ZipOutputStream
	 * @param basePath 压缩包内相对路径
	 * @throws IOException
	 */
	private static void compress(File srcFile, ZipOutputStream zos, String basePath) throws IOException {
		if (srcFile.isDirectory()) {
			compressDir(srcFile, zos, basePath);
		} else {
			compressFile(srcFile, zos, basePath);
		}
	}

	/**
	 * 压缩
	 * @param srcPath 文件路径
	 * @throws IOException
	 */
	public static void compress(String srcPath) throws IOException {
		File srcFile = new File(srcPath);
		compress(srcFile);
	}

	/**
	 * 文件压缩
	 * @param srcPath 源文件路径
	 * @param destPath 目标文件路径
	 * @throws IOException
	 */
	public static void compress(String srcPath, String destPath) throws IOException {
		File srcFile = new File(srcPath);
		compress(srcFile, destPath);
	}

	/**
	 * 压缩目录
	 * @param dir
	 * @param zos
	 * @param basePath
	 * @throws IOException
	 */
	private static void compressDir(File dir, ZipOutputStream zos, String basePath) throws IOException {

		File[] files = dir.listFiles();

		// 构建空目录  
		if (files.length < 1) {
			ZipEntry entry = new ZipEntry(basePath + dir.getName() + PATH);
			zos.putNextEntry(entry);
			zos.closeEntry();
		}

		for (File file : files) {
			// 递归压缩  
			compress(file, zos, basePath + dir.getName() + PATH);
		}
	}

	/**
	 * 文件压缩
	 * @param file 待压缩文件
	 * @param zos ZipOutputStream
	 * @param dir 压缩文件中的当前路径
	 * @throws IOException
	 */
	private static void compressFile(File file, ZipOutputStream zos, String dir) throws IOException {
		/**
		 * 压缩包内文件名定义
		 * 
		 * <pre>
		 * 如果有多级目录，那么这里就需要给出包含目录的文件名 
		 * 如果用WinRAR打开压缩包，中文名将显示为乱码
		 * </pre>
		 */
		ZipEntry entry = new ZipEntry(dir + file.getName());
		zos.putNextEntry(entry);

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		int count;
		byte data[] = new byte[BUFFER_SIZE];
		while ((count = bis.read(data, 0, BUFFER_SIZE)) != -1) {
			zos.write(data, 0, count);
		}
		bis.close();
		zos.closeEntry();
	}

	/**
	 * 压缩文件成字节数组，注：大型文件内存占用会多
	 * @param file
	 * @return
	 * @throws IOException
	 * @throws
	 * @author jixf
	 */
	public static byte[] compressFile(File file) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ZipOutputStream zout = new ZipOutputStream(out);
		zout.putNextEntry(new ZipEntry("0"));
		int len = 0;
		byte[] buf = new byte[BUFFER_SIZE];
		while ((len = bis.read(buf)) != -1) {
			zout.write(buf, 0, len);
		}
		bis.close();
		zout.closeEntry();
		zout.close();
		return out.toByteArray();
	}
}
