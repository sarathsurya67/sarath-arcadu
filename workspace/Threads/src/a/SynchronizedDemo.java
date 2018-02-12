package a;

class Display
	{
		public synchronized void wish(String name)
			{
				for (int i = 0; i < 5; i++)
					{
						System.out.print("good morning:");
						try
							{
								Thread.sleep(1000);
							} catch (InterruptedException e)
							{
							}
						System.out.println(name);
					}
			}
	}

class MyThread4 extends Thread
	{
		Display d;
		String name;

		MyThread4(Display d, String name)
			{
				this.d = d;
				this.name = name;
			}

		@Override
		public void run()
			{
				d.wish(name);
			}
	}

class SynchronizedDemo
	{
		public static void main(String[] args)
			{
				Display d1 = new Display();
				MyThread4 t1 = new MyThread4(d1, "dhoni");
				MyThread4 t2 = new MyThread4(d1, "yuvaraj");
				t1.start();
				t2.start();
			}
	}
