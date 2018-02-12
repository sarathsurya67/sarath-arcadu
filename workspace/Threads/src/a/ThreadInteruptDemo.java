package a;

class MyThread5 extends Thread
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 5111; i++)
					{
						System.out.println("iamlazy thread");
					}
				try
					{
						Thread.sleep(3000);
					} catch (InterruptedException e)
					{
						System.out.println("i got interrupted");
					}
			}
	}

class ThreadInteruptDemo
	{
		public static void main(String[] args)
			{
				MyThread5 t = new MyThread5();
				t.start();
				t.interrupt();
				System.out.println("end of main thread");
			}
	}
