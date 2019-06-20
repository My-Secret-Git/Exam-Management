package com.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	public final static String getMD5(String s) throws NoSuchAlgorithmException {
		String result = "";
		char hexDidits[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d',
				'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
				'v','w','x','y','z'};
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			byte[] strTemp = s.getBytes();
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j*2];
			int k = 0;
			for(int i=0;i<j;i++) {
				byte b = md[i];
				str[k++] = hexDidits[b>>4&0xf];
				str[k++] = hexDidits[b&0xf];
			}
			result = new String(str);
		return result;
	}
        
}