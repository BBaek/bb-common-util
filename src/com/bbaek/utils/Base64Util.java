package com.bbaek.utils;
import org.apache.commons.codec.binary.Base64;

/**
 * Base64 wrap util
 * @author woonsungbaek
 * @since 2018.01.03
 */
public class Base64Util {

	/**
	 * Decode string to byte array by base64.
	 * @param encStr
	 * @return
	 */
	public static byte[] decode(String encStr) {
		return decode(encStr.getBytes());
	}

	/**
	 * Decode byte array to byte array by base64.
	 * @param bytes
	 * @return
	 */
	public static byte[] decode(byte[] bytes) {
		return Base64.decodeBase64(bytes);
	}
	
	/**
	 * Encode string to byte array by base64.
	 * @param str
	 * @return
	 */
	public static byte[] encode(String str) {
		return encode(str.getBytes());
	}
	
	/**
	 * Encode byte array to byte array by base64.
	 * @param bytes
	 * @return
	 */
	public static byte[] encode(byte[] bytes) {
		return Base64.encodeBase64(bytes);
	}
	
	/**
	 * Encode string to string by base64.
	 * @param str
	 * @return
	 */
	public static String encodeStringToString(String str) {
		return new String(encode(str));
	}
	
	/**
	 * Encode byte array to string by base64.
	 * @param bytes
	 * @return
	 */
	public static String encodeByteArrayToString(byte[] bytes) {
		return new String(encode(bytes));
	}
}
