package jdk7;

import sun.misc.BASE64Encoder;

public class CodeJava7 {

	public static void main(String[] args) {
		System.out.println("This program will only run on Java 7");
		String message = "This program will only run on Java 7";
		BASE64Encoder encoder = new BASE64Encoder();
		String encoded = encoder.encode(message.getBytes());
		System.out.println(encoded);
	}

}
