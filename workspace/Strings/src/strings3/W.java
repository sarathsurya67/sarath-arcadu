package strings3;

public class W
	{
		public static void main(String[] args)
			{
				String s1 = "abc1cyx2hello3done";
				String[] s2 = s1.split("\\d");// split() of String cls Accepting
												// Regular Expression.
				for (String s3 : s2)
					{
						System.out.println(s3);
					}
			}
	}
