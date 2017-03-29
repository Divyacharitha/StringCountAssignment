package com.spring.stringexp;

/**
 * Do String encoding
 *
 */
public class StringEncode {
	private String inputstring;

	public void setInputstring(String inputstring) {
		this.inputstring = inputstring;
	}

	public void printEncode() {
		inputstring = inputstring.trim();
		int strLength = inputstring.length();
		if (strLength > 2) {
			System.out.println("Encode value ==> " + inputstring.substring(0, 1) + (strLength - 2)
					+ inputstring.substring(strLength - 1));
		}
		else {
			System.out.println("Please give more than 3 charecters");
		}
	}
}
