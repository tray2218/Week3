package com.coderscampus.objects;

import java.util.Date;

public class WhileLoopExample {
	void whileLoopExample1 () {
        // this is exactly how a For loop works
		// you don't actually ever NEED a For loop
		// as you can create one with a WHILE loop
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}	
			
			System.out.println("Done");
		}
    
	void whileLoopExample2 () {
		
	Date now = new Date();
	Date stopNow = new Date(124, 1, 19, 17, 36, 0);
	int i = 0;
	while (now.before(stopNow)) {
		i = i + 1;
		System.out.println(i + ": " + now);
		now= new Date();
	}

	}
}
