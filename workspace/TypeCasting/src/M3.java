class A extends Thread
	{
		@Override
		public void run()
			{
				for (int j = 0; j < 1000; j++)
					{
						System.out.println(j);
					}
			}

	}

class M3
	{
		public static void main(String[] args)
			{
				A a1 = new A();
				a1.start();
				try
					{
						Thread.currentThread().sleep(20000);

					} catch (InterruptedException ex)
					{
						ex.getMessage();
					}
				for (int i = 0; i < 1000; i++)
					{
						System.out.println("main");
					}
			}
	}
