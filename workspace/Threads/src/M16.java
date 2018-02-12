class M1 extends Thread
	{
		M1()
			{
				start();
			}

		@Override
		public void run()
			{
				for (int i = 0; i <= 1000; i++)
					{
						System.out.println(i);
					}
			}
	}

public class M16
	{
		public static void main(String[] args)
			{
				M1 m1 = new M1();
				for (int i = 0; i < 1000; i++)
					{
						System.out.println(i);
					}
			}
	}