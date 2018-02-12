package strings;

public class S
	{
		public static void main(String[] args)
			{
				String s1 = "ja";
				String s2 = "va";
				String s3 = s1 + s2;
				String s4 = s1.concat(s2);// internally using + operator.//use +
											// while adding two numbers,concat()
											// adding two Strings.
				System.out.println(s3);
				System.out.println(s4);
			}
	}
