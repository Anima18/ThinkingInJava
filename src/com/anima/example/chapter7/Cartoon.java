package com.anima.example.chapter7;

class Art { 
	
	public Art() {
		System.out.println("Art constructor");
	}
}

class Drawing extends Art { 
	
	protected int i = 1;
	
	private void print(String message) {
		System.out.println(message);
	}
	
	/*public Drawing() {
		System.out.println("Drawing constructor");
	}*/
	
	public Drawing(String hello) {
		System.out.println("Drawing constructor");
	}
}

public class Cartoon extends Drawing {

	public Cartoon() {
		super("hello");
		System.out.println("Drawing constructor");
	}
	
	public int getI() {
		return i;
	}
	
	public static void main(String[] args) {
		Cartoon c = new Cartoon();
		System.out.println(c.i);
	}
}
