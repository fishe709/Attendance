package cn.itkt.core.log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogFile {
	private String fileName = null;
	private String filePath = null;

	public static void log(LogManager log, String logFileRootPath)
			throws IOException {
		LogFile logFile = new LogFile();
		String fileName=log.getModule()+" "+log.getCurTime().substring(0, 10)+ ".log";
		logFile.setFilePath(logFileRootPath);
		logFile.setFileName(fileName);
		logFile.log(log.getFormatLog(log.getCurTime()));
		logFile = null;

	}

	public void log(String loginfo) throws IOException {
		writeFile(filePath, fileName, loginfo);
	}

	public synchronized void writeFile(String filePath, String fileName,
			String logs) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "/"
				+ fileName, true));
		bw.newLine();
		bw.append(logs);
		bw.flush();
		bw.close();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
