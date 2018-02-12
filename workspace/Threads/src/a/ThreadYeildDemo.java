package a;

class MyThread extends Thread
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 2000; i++)
					{
						Thread.yield();
						System.out.println("child thread------->1");
					}

			}
	}

class Thread1 implements Runnable
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 2000; i++)
					{
						System.out.println("child thread 2");
					}
			}
	}

class ThreadYieldDemo
	{
		public static void main(String[] args)
			{
				MyThread t = new MyThread();
				Thread1 t2 = new Thread1();
				Thread t3 = new Thread(t2);
				t.start();
				t3.start();
				t.interrupt();
				t.setPriority(9);
				t3.setPriority(9);
				for (int i = 0; i < 2000; i++)
					{
						System.out.println("main thread");
					}
				System.out.println(
						"t1-----------------------------------------------------------------------" + t.getPriority());
				System.out.println(
						"t2-----------------------------------------------------------------------" + t3.getPriority());
				System.out.println(
						"--------------------------------------------------------------------------------------------"
								+ t.isInterrupted());

			}
	}
