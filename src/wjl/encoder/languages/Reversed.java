/**
 * Created by Wesley, on 23 aug. 2014, at 18:08:14
 */
package wjl.encoder.languages;

import java.util.HashMap;

import wjl.interfaces.IEncoding;

public class Reversed implements IEncoding{
	public Reversed(){
		register('a', 'b');
		register('c', 'd');
		register('e', 'f');
		register('g', 'h');
		register('i', 'j');
		register('k', 'l');
		register('m', 'n');
		register('o', 'p');
		register('q', 'r');
		register('s', 't');
		register('u', 'v');
		register('w', 'x');
		register('y', 'z');

		register('A', 'B');
		register('C', 'D');
		register('E', 'F');
		register('G', 'H');
		register('I', 'J');
		register('K', 'L');
		register('M', 'N');
		register('O', 'P');
		register('Q', 'R');
		register('S', 'T');
		register('U', 'V');
		register('W', 'X');
		register('Y', 'Z');
		
		register(' ', '_');
		register('!', '?');
		register('.', ',');
		register('&', '@');
		register('(', ')');
		
		register('1', '2');
		register('3', '4');
		register('5', '6');
		register('7', '8');
		register('9', '0');
	}
	public HashMap<Character, Character> encoding = new HashMap<Character, Character>();
	
	@Override
	public void register(char in, char out){
		encoding.put(in, out);
		encoding.put(out, in);
	}
	
	@Override
	public HashMap<Character, Character> getEncoding() {
		return encoding;
	}
}