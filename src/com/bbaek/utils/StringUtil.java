package com.bbaek.utils;

/**
 * String convert util
 * @author woonsungbaek
 * @since 2018.01.03
 */
public class StringUtil {

	/**
	 * Convert hex string to byte array.
	 * @param hex
	 * @return
	 */
	public static byte[] hexStringToByteArray(String hex) {
		int len = hex.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
		}
		return data;
	}

	/**
	 * Convert byte array to hex string.
	 * @param bytes
	 * @return
	 */
	public static String byteArrayToHexString(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02X", b & 0xff));
		}
		return sb.toString();
	}
}
