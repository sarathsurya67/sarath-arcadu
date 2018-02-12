package App2;

class A extends Thread
	{
		@Override
		public void run()
			{
				System.out.println("done");
			}
	}

public class Manager1
	{
		public static void main(String[] args)
			{
				A a1 = new A();
				System.out.println("default properties");
				long id = a1.getId();
				String name = a1.getName();
				int priority = a1.getPriority();
				boolean deamonstatus = a1.isDaemon();
				System.out.println(id);
				System.out.println(name);
				System.out.println(priority);
				System.out.println(deamonstatus);
				a1.start();

			}
	}
