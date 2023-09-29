import java.util.ArrayList;

public class ArrayListProj {

	public static void main(String[] args) {

		String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		fruits[3] = "Watermelon";
	//	System.out.println(fruits); 此处不可以直接打印出来，需要遍历
		for (String element: fruits) {
	         System.out.print(element+" ");
	      }
        System.out.println("");
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");
		
		fruitList.remove("Strawberry");
		System.out.println(fruitList.contains("Rasberry"));
		fruitList.add("Banana");
		System.out.println(fruitList);
		fruitList.remove(0); //delete first element
		System.out.println(fruitList);
		

	}

}
// 这个是很好的练习字符串数组额用法。字符串数组固定个数，但是ArrayList可以灵活，删除，增加都可以。
//ArrayList 同样可以遍历，方法相同于普通Array