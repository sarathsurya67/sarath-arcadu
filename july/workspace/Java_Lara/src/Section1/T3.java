package Section1;

public class T3
	{
		static int test(int i)
			{
				return i++;
			}

		public static void main(String[] args)
			{
				int i = 0;
				System.out.println(i);
				i = test(i++); // test(i++)----> main i = bbec 1 then o is
								// sending to test so 0 is return then test
								// (I++)=0
				// so i = 0;
				System.out.println(i);
			}
	}
