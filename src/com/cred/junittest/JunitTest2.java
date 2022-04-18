package com.cred.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitTest2 {

	@Test()
	void test() {
	//Optional<Demo1>d2=Optional.ofNullable(d1).orElseGet("d1 is null");
		System.out.println("Inside 2");
		Demo1 d1 = new Demo1();	
	int out = d1.square(5);
	System.out.println(out);
	assertEquals(25, out);
	}
	
}
