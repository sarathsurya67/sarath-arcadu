package strings4;

public class G
	{
		public static void main(String[] args)
			{
				String s1 = "hello";
				String s2 = "again";
				System.out.printf("%s %s", s1, s2);
				System.out.printf("\n%s %s", s2, s1);
				System.out.printf("\n%1$s %2$s", s1, s2);
				System.out.printf("\n%2$s %1$s", s1, s2);
			}
	}
