package test;

public class Split
	{
		public static void main(String arg[])
			{
				String s = "contact@tutorial4us.com";
				String[] s1 = s.split("@"); // divide string based on @
				for (String c : s1) // foreach loop
					{
						System.out.println(c);
					}
			}
	}
