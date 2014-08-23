/**
 * Created by Wesley, on 23 aug. 2014, at 16:51:37
 */
package wjl.main;

import wjl.encoder.Encoder;
import wjl.encoder.languages.Random;
import wjl.encoder.languages.Reversed;

public class Main {

	public static void main(String[] args){
		String message = "Hallooo!, An encryption";
		
		String encrypted1 = Encoder.encrypt(message, new Reversed());
		String encrypted2 = Encoder.encrypt(encrypted1, new Random());

		String decrypted1 = Encoder.decrypt(encrypted1, new Reversed());
		
		String decrypted2h = Encoder.decrypt(encrypted2, new Random());
		String decrypted2f = Encoder.decrypt(decrypted2h, new Reversed());

		System.out.println(encrypted1);
		System.out.println(decrypted1);	
		
		System.out.println(encrypted2);
		System.out.println(decrypted2f);
	}
}