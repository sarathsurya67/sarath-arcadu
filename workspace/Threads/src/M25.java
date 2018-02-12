
public class M25
	{
		public static void main(String[] args)
			{
				Thread t1 = new Thread(new Runnable() {
					@Override
					public void run()
						{
							for (int i = 0; i < 1000; i++)
								{
									System.out.println(i);
								}
						}
				});
				t1.start();
				for (int j = 2000; j < 3000; j++)
					{
						System.out.println(j);
					}
			}
	}
