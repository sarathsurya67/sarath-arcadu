
public class M21
	{
		public static void main(String[] args)
			{
				class A implements Runnable
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
				Thread t1 = new Thread(a1);
				t1.start();

				for (int i = 0; i < 1000; i++)
					{
						System.out.println(i);
					}
			}
	}
