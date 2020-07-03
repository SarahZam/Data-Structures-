package Stack;

import java.util.LinkedList;

public class Challenge {

	
	static LinkedList<Character> chars = new LinkedList<>();
	
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        chars.clear();
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        chars.clear();
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        chars.clear();
        // should return false
        System.out.println(checkForPalindrome("hello"));
        chars.clear();
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	
    	convertList(string);
    	
    	for(int i = chars.size()-1; i>=(chars.size()/2); i--) {
    		if(chars.peek() == chars.get(i)) {
    			chars.pop();
    		}
    		else {
    			break;
    		}
    		
    		return true;
    	}
    	
        return false;
    }
    
    public static LinkedList<Character> convertList(String string){
    	
    	string = string.replaceAll("[^A-Za-z]+", "").toUpperCase();
    	for(char ch:string.toCharArray()) {
    		chars.add(ch);
    	}
    	
    	return chars;
    }
}
