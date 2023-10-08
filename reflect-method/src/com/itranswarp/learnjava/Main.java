package com.itranswarp.learnjava;
import java.lang.reflect.Method;
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:
		Method m=p.getClass().getDeclaredMethod("setName", String.class);
		m.invoke(p, "Xiao Ming");
		Method n=p.getClass().getDeclaredMethod("setAge", int.class);
		n.invoke(p, age);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
