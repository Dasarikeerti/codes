
public class StringBasic {

	public static void main(String[] args) {
//Two ways to create strings:
		// 1.by using literal:
		String s1 = "keerthi"; // 1 obj
		// 2.by using new operator:
		String s2 = new String("Dasari");// 2 obj

		// To find length of the string:
		String s3 = new String("King"); // o/p:4
		System.out.println(s3.length());
		String s4 = new String();
		System.out.println(s4.length()); // o/p:0
		// String s8=null;
		// System.out.println(s8.length()); o/p:throws exception for null
		String s9 = "   ";
		System.out.println(s9.length()); // o/p:3 (spaces)

//2 methods in string to check whether the string is empty or not:
		// 1.length():gives integer output:
		String s5 = "Anu";
		System.out.println(s5.length()); // o/p:3
		// String s8=null;
		// System.out.println(s8.length()); o/p:throws exception for null

		// 2.isEmpty():gives boolean output:
		String s6 = "Akhil";
		System.out.println(s6.isEmpty()); // o/p:false
		String s7 = "";
		System.out.println(s7.isEmpty()); // o/p:true

//comparing two strings by using 
		// 1 equals():It gives boolean output(compares value)
		String s11 = "siddhu";
		String s12 = "Roy";
		System.out.println(s11.equals(s12)); // o/p:false
		String s13 = "Roy";
		System.out.println(s12.equals(s13)); // o/p:true

		// 2.equalsIgnoreCase:It ignores upper and lower case & gives boolean o/p
		String s14 = "Dasari";
		String s15 = "dasari";
		System.out.println(s14.equalsIgnoreCase(s15)); // true

		// 3.compareTo:It gives integer output
		String s16 = "a";// ASCII 97
		String s17 = "A";// ASCII 65 I.E 97-65= 32(String1-String2)
		System.out.println(s16.compareTo(s17));// o/p:32
		String s18 = "ab";
		String s19 = "AB";
		System.out.println(s18.compareTo(s19));// 32...It compares 1st letter
		String s20 = "aA";
		String s21 = "aB";
		System.out.println(s20.compareTo(s21));// -1..It ignores 0 i.e a-a=0 and prints A-B
		// 4.compareIgnoreCase:It ignores upper and lower case & gives boolean o/p
		String s22 = "V";
		String s23 = "v";
		System.out.println(s22.compareToIgnoreCase(s23));// o/p:0
		String s24 = "DA";
		String s25 = "dB";
		System.out.println(s24.compareToIgnoreCase(s25));// o/p:-1

	}

}
