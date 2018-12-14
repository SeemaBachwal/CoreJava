package com.exceptions;

import java.io.FileNotFoundException;

class Super {
	void show() throws FileNotFoundException {
		System.out.println("parent class");
	}
}

public class Sub extends Super {
	void show() // Correct
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		Super s = new Sub();
		try {
			s.show();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
