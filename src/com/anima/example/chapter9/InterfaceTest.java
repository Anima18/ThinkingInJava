package com.anima.example.chapter9;

interface Action {
	int Count = 8;
}

class ActionImpl implements Action {
	
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		interfaceFileTest();
		
	}
	
	/**
	 * 证明接口的域是static，final
	 */
	public static void interfaceFileTest() {
		//证明域是static
		System.out.println(ActionImpl.Count);
		
		//证明域是public
		ActionImpl action = new ActionImpl();
		System.out.println(action.Count);
		
		//证明域是final
		//action.Count = 10;
	}
}
