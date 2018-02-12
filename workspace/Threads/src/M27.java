
public class M27
	{
		public static Runnable getRunnable()
			{
				Runnable r1 = new Runnable() {
					@Override
					public void run()
						{
							for (int i = 0; i < 1000; i++)
								{
									System.out.println(i);
								}
						}
				};
				return r1;

			}

		public static void main(String[] args)
			{
				Thread t1 = new Thread(getRunnable());
				t1.start();
				for (int j = 1000; j < 2000; j++)
					{
						System.out.println(j);
					}
			}
	}
