package com.anima.example.chapter11;

import java.util.ArrayList;
import java.util.List;

class Season {
  //.....  
}

class Spring extends Season {
  //......  
}

class Summer extends Season {
 //.......
}

public class PECSTest {
	public static void main(String[] args) {
		List<? extends Season> list1=new ArrayList<>();
        //list1.add(new Spring());//������벻ͨ������Ϊ�������޷�ȷ��list�����е����͡�
        List<? extends Season> list2=new ArrayList<Spring>();
        //list2.add(new Spring());//Ҳ���޷�ͨ������
        //ͨ�����ģ�����֪�� ��extends Season��ʾ���Խ��յ�����Ϊ Seaon ���������ࡣ
        //���Ǵ˴����У���Ϊ���ܴ����������spring,����summer,�������޷�ȷ�����崫�ݽ�������ʲô��
        //�����޷���ȫ����������Ӷ��󣬵��������Խ����������� �ĸ�ֵ�����£�

//
        List<Spring> list3=new ArrayList<Spring>();
        List<? extends Season> list4 = list3;//����������list2���Աȣ��޷�ֱ��add spring���͵Ķ���
                                           //���ǿ���ֱ�ӽ�spring���͵�list��ֵ��
        
        List<Season> seasons=new ArrayList<Season>();
        List<? super Spring> spring = seasons;
        spring.add(new Spring());//ok
//        spring.add(new Summer());//error
//        spring.add(new Season());//error
//        spring.add(new Object());//error
        
        List<? super Season> sea=new ArrayList<>();
        sea.add(new Spring());//ok
        sea.add(new Summer());//ok
        sea.add(new Season());//ok
        
        MyThead m = new MyThead();
        m.start();
        MyRunnable myRunnabl = new MyRunnable();
        Thread t = new Thread(myRunnabl);
        t.start();
	}
}

class MyThead extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("myThead");
	}
	
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MyRunnable");
	}
	
}
