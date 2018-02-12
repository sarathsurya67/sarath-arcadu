
class I extends Thread
	{
		@Override
		public void run()
			{
				int i = 10 / 0;
				System.out.println("end of child");
			}
	}

public class M13
	{
		public static void main(String[] args)
			{
				I obj = new I();
				obj.start();
				for (int i = 1000; i < 2000; i++)
					{
						System.out.println(i);
					}
				// System.out.println("Hello World!");
			}
	}