package com.anima.example.chapter1;

/**
 * A class comment
 * @author Admin
 * @version 1.0
 */
public class Documentation1 {
  /** A field comment */
  public int i;
  
  /**
   * @see Documentation2 filed
   */
  public Documentation2 documentation2;
  
  /**
   * 2����ֵ���
   * @param param1 �����ֵ
   * @param param2 �����ֵ
   * @return param1 + param2
   * @throws Exception ����쳣
   */
  public int add(int param1, int param2) throws Exception {
	  return param1 + param2;
  }
} 
