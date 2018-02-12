
class A extends Thread
	{
		@Override
		public void run()
			{
				for (char i = 'a'; i <= 'z'; i++)
					{
						System.out.println(i);
					}
			}
	}

public class B
	{
		public static void main(String[] args)
			{
				A a1 = new A();
				a1.start();
				for (int i = 1; i <= 100; i++)
					{
						System.out.println(i);
					}
			}
	}
