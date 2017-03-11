package com.anima.example.chapter9;

import java.util.ArrayList;
import java.util.List;

interface Action {
	int Count = 8;
}

class ActionImpl implements Action {
	
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		//interfaceFileTest();
		
		List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        //System.out.println(list.size());
        
        /*for(int i = 0; i < list.size(); i++){
            
            if(list.get(i).equals("2")) {
            	list.remove(i);
            }
            if(list.get(i).equals("1")) {
            	list.remove(i);
            }
            System.out.println(list.get(i));
        }*/
        
        for(String s : list) {
        	if(s.equals("2")) {
            	list.remove(s);
            }
        }
		
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
