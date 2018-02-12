package a;

class MyThread1 extends Thread
	{
		@Override
		public void run()
			{
				for (int i = 0; i < 5; i++)
					{
						System.out.println("Seethe Thread");
						try
							{
								Thread.sleep(2000);
							} catch (InterruptedException e)
							{
							}
					}
			}
	}

class ThreadJoinDemo
	{
		public static void main(String[] args) throws InterruptedException
			{
				MyThread1 t = new MyThread1();
				t.start();
				t.join();
				for (int i = 0; i < 5000; i++)
					{
						System.out.println("Rama Thread");
					}
			}
	}
