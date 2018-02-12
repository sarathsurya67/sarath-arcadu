
public class M30
	{
		public static void main(String[] args)
			{
				new Thread(new Runnable() {
					@Override
					public void run()
						{
							System.out.println("runnable");
						}
				}) {
					@Override
					public void run()
						{
							System.out.println("Thread");
						}
				}.start();
			}
	}
