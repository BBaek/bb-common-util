package com.bbaek.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * File util
 * @author woonsungbaek
 * @since 2018.01.03
 */
public class FileUtil {
	/**
	 * Writes a string to file.
	 * @param fileName
	 * @param filePath
	 * @param content
	 * @return
	 */
	public static boolean writeFile(String fileName, String filePath, String content) {
		return writeFile(fileName, filePath, content, true);
	}
	
	/**
	 * Writes a string to file.
	 * @param fileName
	 * @param filePath
	 * @param content
	 * @param append
	 * @return
	 */
	public static boolean writeFile(String fileName, String filePath, String content, boolean append) {
		return writeFile(filePath + File.separator + fileName, content, append);
	}
	
	/**
	 * Writes a string to file.
	 * @param file
	 * @param content
	 * @param append If the file exists, append content to the file.
	 * @return
	 */
	public static boolean writeFile(String file, String content, boolean append) {
		boolean rtn = false;
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file, append));
			bw.write(content);
			bw.flush();
			rtn = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return rtn;
	}
	
//	public static String getFileString(MultipartFile file) throws IOException {
//		if(!file.isEmpty()){
//			byte[] fileData = file.getBytes();
//			return new String(fileData, "UTF8");
//		}
//		return null;
//	}
//	
//	public static InputStream getFileInputStream(MultipartFile file) throws IOException {
//		if(!file.isEmpty()){
//			return file.getInputStream();
//		}
//		return null;
//	}
	/**
	 * Reads a file.
	 * @param fileName
	 * @param filePath
	 * @return
	 */
	public static StringBuilder readFile(String fileName, String filePath) {
		return readFile(filePath + File.separator + fileName);
	}
	
	/**
	 * Reads a file.
	 * @param absolutePath
	 * @return
	 */
	public static StringBuilder readFile(String absolutePath) {
		StringBuilder sb = null;
		BufferedReader br = null;
		try {
			sb = new StringBuilder();
			String buff;
			br = new BufferedReader(new FileReader(absolutePath));
			while((buff = br.readLine()) != null) {
				sb.append(buff).append(System.getProperty("line.separator"));
				System.out.println(buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb;
	}
	
	/**
	 * Deletes a file.
	 * @param fileName
	 * @param filePath
	 * @return
	 */
	public static boolean deleteFile(String fileName, String filePath) {
		return deleteFile(filePath + File.separator + fileName);
	}
	
	/**
	 * Deletes a file.
	 * @param absolutePath
	 * @return
	 */
	public static boolean deleteFile(String absolutePath) {
		try {
			File file = new File(absolutePath);
			return file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
