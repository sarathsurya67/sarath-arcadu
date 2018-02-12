
class A1 extends Thread
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 2000; i++)
					{
						System.out.println("from Thread--A");
					}
			}
	}

class B1 extends Thread
	{
		@Override
		public void run()
			{
				for (int j = 0; j < 2000; j++)
					{
						System.out.println("from Thread-B");
					}

			}

	}

public class M8
	{
		public static void main(String[] args)
			{
				A1 t1 = new A1();
				B1 t2 = new B1();
				t1.start();
				t2.start();
				for (int k = 0; k < 2000; k++)
					{
						System.out.println("from Thread main");
					}
			}

	}
