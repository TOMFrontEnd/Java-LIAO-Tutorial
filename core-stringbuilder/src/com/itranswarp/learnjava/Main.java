package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "test success" : "test failed");
	}

	static String buildInsertSql(String table, String[] fields) {
		// TODO:
		StringBuilder sb = new StringBuilder(100);
		sb.append("INSERT INTO ")
          .append(table)
          .append(" (")
		  .append(String.join(",", fields))
		.append(") VALUES (?, ?, ?)");
		
		
				
		return sb.toString();
	}

}
