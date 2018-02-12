package strings1;

public class M
	{
		public static void main(String[] args)
			{
				String s1 = "abc;xyz;hello;123";
				String[] s2 = s1.split(";");
				for (String s3 : s2)
					{
						System.out.println(s3);
					}
			}
	}
