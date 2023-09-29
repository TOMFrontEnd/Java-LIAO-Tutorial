package com.itranswarp.learnjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/**
 * 降序排序
 */
public class Main {
	public static void main(String[] args) {
		Integer[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		// 排序前:
		System.out.println(Arrays.toString(ns));
		// 因为自带的SORT只有升序功能，所以要自己实现降序排序，一个是冒泡法
		// 另外一个先排序，然后颠倒。
		//Arrays.sort(ns);
		// 排序后:reverse it
		//reverse(ns);
		
		//write a function return  reverse of an array
		//reverse
		//first loop run i=length-1 times ,i=0, then next
		//loop run lentgh-1-i times,j start 1
		/*for (int i=0;i<ns.length-1;i++) {
			for (int j=0;j<ns.length-1-i;j++) {
               	if (ns[j]<ns[j+1]) {
					int biger = ns[j+1];
					ns[j+1] = ns[j];
					ns[j] = biger;
				}
					
			}
			
		} */
		Arrays.sort(ns);
		//convert array to arraylist, then use its reverse method to get a decending array
		Collections.reverse(Arrays.asList(ns));
			
		System.out.println(Arrays.toString(ns));
		if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
			System.out.println("test success");
		} else {
			System.out.println("test failed");
		}
	}
	/*public static void reverse(int[] oneArray) {
		for (int i = 0; i < oneArray.length / 2; i++) {
			int temp = oneArray[i];
			oneArray[i] = oneArray[oneArray.length - i - 1];
			oneArray[oneArray.length - i - 1] = temp;
		}*/
	}
// 非常奇怪， int[] array 用Collections.reverse 不好用，但是 Integer[] array就可以。
/*、怎么把数组转为arraylist：


//法一：
ArrayList<Element> arrayList = new ArrayList<Element>(Arrays.asList(array));
//法二：
List<Element> list = Arrays.asList(array);//list固定长度列表
//法三：
Element[] array = {new Element(1), new Element(2)};
List<element> list = new ArrayList<element>(array.length);
Collections.addAll(list, array);
*/
