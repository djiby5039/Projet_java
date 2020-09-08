package com.esmtl32019.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PileTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		Pile tableau = new Pile();
		tableau.setTaille(40);
	}
	@Test
	public void Pile() {
		Pile tableau = new Pile();
		assertEquals("La taille doit etre",20, tableau.setTaille(20));
	}

}
