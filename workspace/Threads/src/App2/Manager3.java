package App2;

public class Manager3
	{
		public static void main(String[] args)
			{
				Thread t1 = Thread.currentThread();
				System.out.println(t1.getId());
				System.out.println(t1.getName());
				System.out.println(t1.getPriority());
				System.out.println(t1.isDaemon());
				System.out.println("----------------");
			}
	}
