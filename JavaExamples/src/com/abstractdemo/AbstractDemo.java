package com.abstractdemo;

interface AbstractI {

	void disp();
}

abstract class AbstractSuper implements AbstractI {

	public abstract void show();
	public abstract void toShow();
	public abstract void toDisp();
	
}

class AbstractSubclass extends AbstractSuper{

	@Override
	public void disp() {
		System.out.println("display method called");
	}

	@Override
	public void show() {
		System.out.println("show method called");
	}

	@Override
	public void toShow() {
		System.out.println("toShow method called");
	}

	@Override
	public void toDisp() {
		System.out.println("toDisp method called");
	}
	
}
public class AbstractDemo {
	
	public static void main(String[] args) {
	
		AbstractI o1 = new AbstractSubclass();
		// with this ref only the methods declared in Interface
		o1.disp();
		System.out.println("\n");
		AbstractSuper o2 = new AbstractSubclass();
		// with this ref all the methods are accessible
		o2.disp();
		o2.show();
		o2.toDisp();
		o2.toShow();
	}
}