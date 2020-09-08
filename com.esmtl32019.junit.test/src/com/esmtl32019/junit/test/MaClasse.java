package com.esmtl32019.junit.test;

public class MaClasse {
	public int multiply(int x, int y){
	
	 	//The following is just an example
	
		if(x >999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x*y;
}}
