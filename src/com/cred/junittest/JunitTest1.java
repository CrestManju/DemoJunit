package com.cred.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class JunitTest1 {

	Demo1 d1=null;
	@Before
	void objectIntialize()
	{
		System.out.println("Inside before class");
		d1 = new Demo1();	
	}
	
	@Test()
	void test() {
	//Optional<Demo1>d2=Optional.ofNullable(d1).orElseGet("d1 is null");
		System.out.println("Inside 1");
		d1 = new Demo1();	
	int out = d1.square(5);
	System.out.println(out);
	assertEquals(26, out);
	}

}
