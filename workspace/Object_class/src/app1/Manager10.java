package app1;

class Person
	{
		String name;
		int age;

		@Override
		public String toString()
			{
				String s1 = "Adress : " + super.toString();
				String s2 = " State :     name = " + name + ",age  =" + age;
				return s1 + "," + s2;
			}
	}

public class Manager10
	{
		public static void main(String[] args)
			{
				Person p1 = new Person();
				p1.name = "abc";
				p1.age = 22;
				System.out.println(p1);
			}
	}
