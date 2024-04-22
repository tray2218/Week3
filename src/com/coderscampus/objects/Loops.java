package com.coderscampus.objects;

public class Loops {
	
	public static void main (String[] args) {

		// for Loop example code
		ForLoopExample forExample = new ForLoopExample();
//		example1.forLoopExample();
	    //forExample.incrementExample1();
		int j = 0;
		forExample.incrementExample2(j++);
		System.out.println("Outside method j = " + j);
		forExample.incrementExample2(++j);
		System.out.println("Outside method j = " + j);
	    // while loop example code
	   // WhileLoopExample whileExample1 = new WhileLoopExample();
//	    whileExample1.whileLoopExample1();
	   // whileExample1.whileLoopExample2();
}
}