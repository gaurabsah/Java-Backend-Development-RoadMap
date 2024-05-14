package com.turing.codinginterview;

public class GarbageTest {
	public GarbageTest g;
	
	public static void main(String[] args) {
		GarbageTest g2= new GarbageTest();
		GarbageTest g3 = new GarbageTest();
		g2.g=g3;
		g3.g=g2;
		g2=new GarbageTest();
		g3=g2;
//		garbageCollection();
	}

}
