package getClass;

class G
	{
		void test()
			{

			}
	}

public class Manager5
	{
		public static void main(String[] args) throws Exception
			{
				G g1 = new G();
				Class c1 = g1.getClass();
				Class c2 = G.class;
				Class c3 = Class.forName("getClass.G");
				System.out.println(c1 == c2);
				System.out.println(c2 == c3);
			}
	}
