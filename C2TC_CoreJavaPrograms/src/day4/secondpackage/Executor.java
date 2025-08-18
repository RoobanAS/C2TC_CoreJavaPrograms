package day4.secondpackage;

import day4.firstpackage.base;

public class Executor {
	public static void main(String[] args) {
		
		base b1 = new base();

		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}

