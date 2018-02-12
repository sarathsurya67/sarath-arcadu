
public class M20
	{
		public static void main(String[] args)
			{
				class A extends Thread
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

				A a1 = new A();
				a1.start();

				for (int i = 0; i < 1000; i++)
					{
						System.out.println(i);
					}
			}
	}
