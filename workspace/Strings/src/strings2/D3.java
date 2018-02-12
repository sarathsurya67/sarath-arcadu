package strings2;

public class D3
	{
		public static void main(String[] args)
			{
				String s1 = "abc hello";
				char[] x = s1.toCharArray();// string converted to Character
											// Array.
				for (int i = 0; i < x.length; i++)
					{
						System.out.print(x[i] + ",");
					}
			}
	}
