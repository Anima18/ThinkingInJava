package com.anima.example;

import java.lang.reflect.Field;

public class TTest<T> {
	
	private T t;
	
	public TTest(T t) {
		this.t = t;
	}
	
	
	public void test(Class c) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		/*Class<?> c = null;  
        c = Class.forName("com.anima.example.User");  */
        Field [] fields = c.getDeclaredFields();  
		
		//Field [] fields = new Field[] {c.getDeclaredField("name")};
        //c.getField(s)
          
        for(Field f:fields){  
            f.setAccessible(true);  
        }  
        //输出p1的所有属性  
        System.out.println("=============About p1===============");  
        for(Field f:fields){  
            String field = f.toString().substring(f.toString().lastIndexOf(".")+1);         //取出属性名称  
            System.out.println(f.getName()+" --> "+f.get(t));  
        }     
	}
	
	public Object getPropertyValue(Object o, String propertyStr) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int indexOf = propertyStr.indexOf(".");
		if(indexOf == -1) {
			Field field = o.getClass().getDeclaredField(propertyStr);
			field.setAccessible(true);
			return field.get(o);
		}else {
			String currentProperty = propertyStr.substring(0, indexOf);
			String subProperty = propertyStr.substring(indexOf+1);
			System.out.println("currentProperty  --> "+currentProperty);  
			System.out.println("subProperty  --> "+subProperty); 
			
			Field field = o.getClass().getDeclaredField(currentProperty);
			field.setAccessible(true);
			Object subObject = field.get(o);
			return getPropertyValue(subObject, subProperty);
		}
		
	}
	
	public static void main(String[] args) {
		User user = new User("Chris", "hello", true, new Address("zhuhai", new Street("xiangzhou")));
		TTest<User> test = new TTest<User>(user);
		try {
			//test.test(User.class);
			String value = test.getPropertyValue(user, "address.street.street").toString();
			System.out.println(value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
