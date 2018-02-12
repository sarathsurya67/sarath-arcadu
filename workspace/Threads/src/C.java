
class Thread1 implements Runnable
	{

		@Override
		public void run()
			{
				int[] array = new int[1000];
				for (int a = 0; a < array.length; a++)
					{
						array[a] = a;
					}
				for (int j = 0; j < array.length; j++)
					{
						System.out.println(array[j]);
					}

			}

	}

public class C
	{
		public static void main(String[] args)
			{
				Thread1 mr = new Thread1();
				Thread t2 = new Thread(mr);
				t2.start();

				int[] array = new int[1000];
				for (int a = 0; a < array.length; a++)
					{
						array[a] = a + 5000;
					}
				for (int j = 0; j < array.length; j++)
					{
						System.out.println(array[j]);
					}

			}

	}
