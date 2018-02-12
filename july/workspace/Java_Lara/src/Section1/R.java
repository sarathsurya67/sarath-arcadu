package Section1;

class R
	{
		public static void main(String[] args)
			{
				int i;
				int j = 10;
				int k = i + j;// 'i' not initialised so compile time error
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
			}
	}
