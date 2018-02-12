
class L1 extends Thread
	{
		@Override
		public void run()
			{
				System.out.println("L begin");
				start();
				System.out.println("L end");
			}
	}

public class M15
	{
		public static void main(String[] args)
			{
				L1 obj = new L1();
				obj.start();
				// int j=10/0;
				for (int i = 0; i <= 1000; i++)
					{
						System.out.println(i);
					}
				// System.out.println("Hello World!");
			}
	}