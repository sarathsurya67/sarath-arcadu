package a;

public class A
	{
		public static void main(String[] args)
			{
				System.out.println(Thread.currentThread().getName());
				Thread t1 = new Thread();
				System.out.println(t1.getName());
				t1.setName("sarath_class");
				System.out.println(t1.getName());
				System.out.println(Thread.currentThread().getName());
				Thread.currentThread().setName("main_nameChanged");
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				Thread.currentThread().setPriority(3 + 3);
				System.out.println(Thread.currentThread().getPriority());
				System.out.println(t1.currentThread().getPriority());

			}
	}
