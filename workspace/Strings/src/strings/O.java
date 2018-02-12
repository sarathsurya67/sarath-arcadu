package strings;

public class O
	{
		public static void main(String[] args)
			{
				String s1 = null;
				String s2 = s1 + null;// Str add
				String s3 = null + s1;// bec of s1 str add
				String s4 = "abc" + null;// bec aof abc Str add
				String s5 = s1 + "xyz";// str add
				String s6 = s1 + s1;// both Str add
				String s7 = s1 + 2000;// Str add
				String s8 = 400 + s1;// Str add
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				System.out.println(s4);
				System.out.println(s5);
				System.out.println(s6);
				System.out.println(s7);
				System.out.println(s8);
				// String s9 = null + 10;//not int,str add no String type hre at
				// leastr 1 oprand is String type.
				// String s10 = 90 + null;
				// String s11 = 90 + 80;// int type not String type
				// String s12 = null + null;not considerd as String Addition.At
				// least operand should be String type while using + oprator in
				// String Addition.
			}
	}
