

package com.test.java;

/***
 * 
 * @author Saroj
 * @version 1.0
 * @since 05/28/2017
 *
 *Description: This class is used to check the case -insensitive feature of java
 *HEXAdecimal literal assignment
 *
 */
public class JavaCaseInsensitive {

	public static void main(String[] args) {
	
		//This is where java is not case sensitive
		int _hexString=0xAbcf;
		int _octString=01276;
		System.out.println("The value of string is:::"+_hexString);
		System.out.println("The octal value  of string is:::"+_octString);
	}

}
