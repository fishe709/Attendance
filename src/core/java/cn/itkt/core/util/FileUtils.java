package cn.itkt.core.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {

	public static String copyFile(InputStream in, String filename, String filePath) {
		File targetFile = new File(filePath);
		FileOutputStream fs = null;
		createDir(targetFile);
		try {
			fs = new FileOutputStream(filePath + filename);
			byte[] buffer = new byte[1024 * 1024];
			// int bytesum = 0;
			int byteread = 0;
			while ((byteread = in.read(buffer)) != -1) {
				// bytesum += byteread;
				fs.write(buffer, 0, byteread);
				fs.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fs != null)
					fs.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return filePath + filename;
	}

	//创建文件夹
	public static void createDir(File targetFile) {
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
	}
}
