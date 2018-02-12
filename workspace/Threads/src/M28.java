
public class M28
	{
		static Thread getThread()
			{
				return new Thread() {
					@Override
					public void run()
						{
							for (int i = 0; i < 1000; i++)
								{
									System.out.println(i);
								}
						}
				};
			}

		public static void main(String[] args)
			{
				Thread t1 = getThread();
				t1.start();
				getThread().start();
				System.out.println("-------------");
				for (int i = 3000; i < 4000; i++)
					{
						System.out.println(i);
					}
			}
	}
