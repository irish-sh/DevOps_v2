package com.interview.prep;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello World!";
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {

		char[] characters = str.toCharArray();
		int first = 0, last = characters.length-1;
		
		while(first < last) {
			char temp = characters[first];
			characters[first] = characters[last];
			characters[last] = temp;
			first++; last--;
		}
		return new String(characters);
	}

}
