package skill_test;

public class Simple
	{
		public static void main(String[] args)
			{
				String s1 = "sarath";
				String s2 = "sarath";
				String a1;
				String a2;
				a1 = "sarath";
				a2 = "barath";
				System.out.println(a1 == a2);
				String s3 = new String("sarath");
				String s4 = new String("sarathdef");
				System.out.println(s1 == s2);
				System.out.println(s3 == s4);
				System.out.println(s1 == s4);
				System.out.println(s1.equals(s2));
				System.out.println(s3.equals(s1));
			}
	}
