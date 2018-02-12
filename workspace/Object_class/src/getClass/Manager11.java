package getClass;

class O
	{

		O(int i)
			{
				System.out.println("L(int");
			}
	}

public class Manager11
	{
		public static void main(String[] args)
				throws ClassNotFoundException, InstantiationException, IllegalAccessException
			{
				Class c1 = Class.forName("getClass.O");
				O obj1 = (O) c1.newInstance();
				System.out.println("done");
			}
	}
