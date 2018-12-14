package com.exceptions;

class Test {
	static void avg() {
		try {
			throw new RuntimeException("demo");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException caught");
		}
	}

	static void div() {
		try {
			// throw new RuntimeException("demo");
			System.exit(0);
		} catch (RuntimeException e) {
			System.exit(0);
			System.out.println("After System.exit(0)");

		} finally {

		}

	}

	public static void main(String args[]) {
		div();
		avg();
		
	}
}