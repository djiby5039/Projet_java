package com.esmtl32019.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaClasseTest {
 @Test(expected = IllegalArgumentException.class)
			public void testExceptionIsThrown() {
				MaClasse tester = new MaClasse();
				tester.multiply(1000, 5);
			}
			@Test
			public void testMultiply() {
				MaClasse tester = new MaClasse();
				assertEquals("10 * 5 must be 50",50, tester.multiply(10,5));
			}

		
		
		
		
		
	}

