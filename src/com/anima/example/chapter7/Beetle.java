package com.anima.example.chapter7;

import com.anima.example.utils.PrintUtil;

class Other {
	Other(String s) {
		PrintUtil.print(s);
	}
}

class Insert {
	protected int i = 39;
	protected int j;
	private Other other1 = new Other("init Other1");
	public Other other2 = new Other("init Other2");
	private static Other other3 = new Other("init Other3");
	
	Insert() {
		PrintUtil.print("i = " + i + ", j = " + j);
		j = 39;
	}
	
	private static int x1 = printInit("init static Insert.x1");
	
	static int printInit(String s) {
		PrintUtil.print(s);
		return 47;
	}
}

public class Beetle extends Insert {

	private int b1 = printInit("init Beetle.b1");
	
	Beetle() {
		PrintUtil.print("i = " + i + ", j = " + j);
	}
	
	private static int x2 = printInit("init static Beetle.x2");
	
	public static void main(String[] args) {
		PrintUtil.print("Beetle main");
		new Beetle();
	}
}
