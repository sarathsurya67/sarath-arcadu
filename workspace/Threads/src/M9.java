class A2 extends Thread
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

public class M9
	{
		public static void main(String[] args)
			{
				A2 t1 = new A2();
				t1.start();
				A2 t2 = new A2();
				t2.start();
				System.out.println("done");

			}

	}
