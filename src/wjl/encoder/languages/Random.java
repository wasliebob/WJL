/**
 * Created by Wesley, on 23 aug. 2014, at 18:50:42
 */
package wjl.encoder.languages;

import java.util.HashMap;

import wjl.interfaces.IEncoding;

public class Random implements IEncoding{
	public Random(){
		register('a', 'z');
		register('c', 'd');
		register('e', 'f');
		register('r', 'h');
		register('x', 'j');
		register('p', 'l');
		register('m', 'n');
		register('o', 'k');
		register('q', 'g');
		register('s', 't');
		register('u', 'v');
		register('w', 'i');
		register('y', 'b');

		register('A', 'Z');
		register('C', 'D');
		register('E', 'F');
		register('R', 'H');
		register('X', 'J');
		register('P', 'L');
		register('M', 'N');
		register('O', 'K');
		register('Q', 'G');
		register('S', 'T');
		register('U', 'V');
		register('W', 'I');
		register('Y', 'B');
		
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