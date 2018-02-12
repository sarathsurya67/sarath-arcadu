package getClass;

class L
	{
		L()
			{
				System.out.println("L()");
			}

		L(int i)
			{
				System.out.println("L(int");
			}
	}

public class Manager10
	{
		public static void main(String[] args)
				throws ClassNotFoundException, InstantiationException, IllegalAccessException
			{
				Class c1 = Class.forName("getClass.L");
				L obj1 = (L) c1.newInstance();
				System.out.println("------------");
				L obj2 = (L) c1.newInstance();
				System.out.println("------------");
			}
	}
