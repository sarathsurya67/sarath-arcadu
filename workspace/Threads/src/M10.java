class E1 implements Runnable
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

public class M10
	{
		public static void main(String[] args)
			{
				E1 mr = new E1();
				Thread t1 = new Thread(mr);
				t1.start();
				E1 mr1 = new E1();
				Thread t2 = new Thread(mr1);
				t2.start();
				System.out.println("done");
			}
	}
