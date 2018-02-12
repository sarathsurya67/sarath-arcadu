package skill_test;

public class C
	{
		private String name;
		private int age;

		C(String name, int age)
			{
				this.name = name;
				this.age = age;
			}

		@Override
		public int hashCode()
			{
				return age;
			}

		public static void main(String[] args)
			{
				C c = new C("sarath", 24);
				C c1 = new C("barath", 24);
				System.out.println(c);
				System.out.println(c1);
				// System.out.println(c.hashCode());
				// System.out.println(c1.hashCode());
			}
	}
