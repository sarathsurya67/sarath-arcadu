
class B11 extends Thread
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 5000; i++)
					{
						System.out.println("*");
					}
			}
	}

class H implements Runnable
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 5000; i++)
					{
						System.out.println(i);
					}
			}
	}

public class D
	{
		public static void main(String[] args)
			{

				B11 t1 = new B11();
				H mr = new H();
				Thread t2 = new Thread(mr);

				t1.start();
				t2.start();

				for (int i = 0; i < 5000; i++)
					{
						System.out.println("&");
					}
			}

	}
