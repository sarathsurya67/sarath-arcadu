
public class M24
	{
		public static void main(String[] args)
			{
				new Thread() {
					@Override
					public void run()
						{
							for (int i = 0; i < 1000; i++)
								{
									System.out.println(i);
								}
						}
				}.start();
				for (int i = 1000; i < 2000; i++)
					{
						System.out.println(i);
					}
			}
	}
