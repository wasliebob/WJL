/**
 * Created by Wesley, on 23 aug. 2014, at 18:04:38
 */
package wjl.interfaces;

import java.util.HashMap;

public interface IEncoding {
	public void register(char in, char out);
	public HashMap<Character, Character> getEncoding();
}