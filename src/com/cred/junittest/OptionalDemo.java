package com.cred.junittest;

import java.util.Optional;

public class OptionalDemo {


public static void main(String[] args) {
	String str ="null";
	Optional<String> str2 = Optional.ofNullable(str);
	String str3 = str2.orElseThrow();
	System.out.println(str3);

	if(str2.isPresent())
	{
		System.out.println("Present");
	}
	else
	{
		System.out.println("Not preset");
	}
	
	
	str2.ifPresent(n-> System.out.println("name is present "+str));
	str2.ifPresentOrElse(n-> System.out.println("name is present "+str), ()-> System.out.println("NOte present at the "));
}
}
