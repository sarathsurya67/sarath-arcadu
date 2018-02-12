class N extends Thread
	{
		N()
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

public class M17
	{
		public static void main(String[] args)
			{
				N n1 = new N();
				n1.start();
				for (int i = 2000; i < 3000; i++)
					{
						System.out.println(i);
					}
			}
	}