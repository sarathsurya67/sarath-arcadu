package arrays1;

public class H
	{
		public static void main(String[] args)
			{
				int i = 10;
				String x[] = new String[i];
				System.out.println("--------------");
				i = 0;
				String y[] = new String[i];// Empty array.
				System.out.println("--------------");
				i = -2;
				String z[] = new String[i];// java.lang.NegativeArraySizeException
				System.out.println("---------------");
			}
	}
