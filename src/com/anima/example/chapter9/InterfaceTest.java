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
	 * ֤���ӿڵ�����static��final
	 */
	public static void interfaceFileTest() {
		//֤������static
		System.out.println(ActionImpl.Count);
		
		//֤������public
		ActionImpl action = new ActionImpl();
		System.out.println(action.Count);
		
		//֤������final
		//action.Count = 10;
	}
}
