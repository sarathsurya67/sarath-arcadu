package skill_test;

public class B
	{
		private String name;
		private int age;

		B(String name, int age)
			{
				this.name = name;
				this.age = age;
			}

		@Override
		public String toString()
			{
				return name + ".........." + age;
			}

		public static void main(String[] args)
			{
				B b = new B("sarath", 24);
				B b1 = new B("barath", 26);
				System.out.println(b);
				System.out.println(b1);

			}
	}
