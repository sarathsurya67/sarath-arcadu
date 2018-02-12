package App2;

class I extends Thread
	{
		I(String name)
			{
				super(name);
			}

		I()
			{

			}
	}

public class Manager7
	{
		public static void main(String[] args)
			{
				I obj1 = new I();
				I obj2 = new I("abc");
				System.out.println(obj1.getName());
				System.out.println(obj2.getName());
				System.out.println("----------------------");
				obj1.setName("thread1");
				obj2.setName("thread2");
				System.out.println(obj1.getName());
				System.out.println(obj2.getName());
			}
	}
