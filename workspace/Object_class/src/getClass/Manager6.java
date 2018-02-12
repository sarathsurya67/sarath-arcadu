package getClass;

class H
	{
		static
			{
				System.out.println("from H SIB");
			}
	}

public class Manager6
	{
		public static void main(String[] args) throws ClassNotFoundException
			{
				Class c1 = Class.forName("getClass.H");
				System.out.println("----------");
				System.out.println(c1);
			}
	}
