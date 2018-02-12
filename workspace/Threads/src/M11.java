
class H1 extends Thread
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 1000; i++)
					{
						System.out.println(i);
					}
			}
	}

public class M11
	{
		public static void main(String[] args)
			{
				H1 h1 = new H1();
				h1.start();
				System.out.println("---------");
				h1.start();
				System.out.println("---------");
			}
	}
