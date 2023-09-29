package com.itranswarp.learnjava;
import java.util.StringJoiner;


/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String select = buildSelectSql(table, fields);
		System.out.println(select);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "successful" : "failed");
	}

	static String buildSelectSql(String table, String[] fields) {
		StringJoiner sj = new StringJoiner(", ", "SELECT ", " FROM ");
		for (String name:fields) {
			sj.add(name);
		}
		return sj+table;
	}

}
