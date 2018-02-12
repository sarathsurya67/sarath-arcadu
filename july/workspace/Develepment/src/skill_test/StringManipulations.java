package skill_test;

public class StringManipulations
	{
		public static void main(String[] args)
			{
				String s1 = new String("Sarath kumar Arcadu");
				System.out.println(s1);
				System.out.println(s1.length());
				System.out.println(s1.getClass().getName());
				System.out.println(s1.charAt(8));
				System.out.println(s1.contains("kumar"));
				String[] s2 = s1.split(" ");
				for (String s3 : s2)
					{
						System.out.println(s3);
					}
				String s3 = s1.concat(" MCA");
				System.out.println(s3);
				System.out.println(s1.toUpperCase());
				System.out.println(s1.toLowerCase());
				System.out.println(s1.indexOf('c'));
				System.out.println(s1.indexOf('s'));
				System.out.println(s1.indexOf('a'));
				System.out.println(s1.indexOf('a', 5));
				System.out.println(s1.lastIndexOf('a'));
			}
	}
