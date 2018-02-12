package getClass;

import java.lang.reflect.Method;

class R
	{
		void test1()
			{
				System.out.println("test1()");
			}

		void test1(int i)
			{
				System.out.println("test1(int)");
			}
	}

public class Manager15
	{
		public static void main(String[] args) throws Exception
			{
				Class c1 = Class.forName("getClass.R");
				Object obj = c1.newInstance();
				Method m1 = c1.getDeclaredMethod("test1");
				m1.invoke(obj);
				System.out.println("---------------");

				Method m2 = c1.getDeclaredMethod("test1", int.class);
				m2.invoke(obj, 10);
				System.out.println("----------");
			}
	}
