/**
 * Created by Wesley, on 23 aug. 2014, at 18:19:09
 */
package wjl.encoder;

import wjl.interfaces.IEncoding;

public class Encoder {
	public static String encrypt(String text, IEncoding encoder){
		if(text != null && encoder != null){
			char[] chars = text.toCharArray();
			String result = "";
			
			for(int i = 0; i < chars.length; i++){
				char c = chars[i];
				if(encoder.getEncoding().containsKey(c)){
					result += encoder.getEncoding().get(c);
				}
			}
			return result;
		}
		return text;
	}
	
	public static String decrypt(String text, IEncoding encoder){
		if(text != null && encoder != null){
			char[] chars = text.toCharArray();
			String result = "";
			
			for(int i = 0; i < chars.length; i++){
				char c = chars[i];
				if(encoder.getEncoding().containsKey(c)){
					result += encoder.getEncoding().get(c);
				}
			}
			return result;
		}
		return text;
	}
}