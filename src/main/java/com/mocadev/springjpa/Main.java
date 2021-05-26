package com.mocadev.springjpa;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2021-01-01
 **/
public class Main {

	public static void main(String[] args) {
		System.out.println("Main.main");

		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("Main.main catch");
			System.exit(0);
		} finally {
			System.out.println("Main.main finally");
		}
	}

}
