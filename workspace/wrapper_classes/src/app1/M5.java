package app1;

public class M5
	{
		public static void main(String[] args)
			{
				String s1 = "10";
				Integer obj = new Integer(s1);// Boxing..,/2nd type
												// constructor.(no
												// alphabets,specialchars).
				int i = obj.intValue();// UnBoxing
				System.out.println(i + " : Done");
			}
	}
