public class StringBuffer_DonebyON {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("This is a String Buffer");

		//1] add the string
		System.out.println(str.append(" Enhance Version of String "));

		//2] Insert string "Object" at 21st position
		System.out.println("After insertion : " + str.insert(21, "Object"));

		//3] reverse the string
		System.out.println(str.reverse());

		//4] replace the word "Buffer" with "Builder"
		StringBuffer sb1 = new StringBuffer("This is String Buffer ");
		System.out.println("After replacing : " + sb1.replace(15, 22, "Builder"));
	}

}
