package com.anima.example.chapter1;

public class DemoTest {
	
	public static void showHalveData(int data) {
		System.out.println(data);
	}
	
	public static void showData(int data) {
		System.out.println(data);
		if(data < 5000) {
			showData(data*2);
			System.out.println(data);
		}else {
			System.out.println(data);
		}
	}
	
	
	public static void main(String[] args) {
		/*Demo demo = new Demo();
		demo.print();*/
		showData(1234);
	}
}
