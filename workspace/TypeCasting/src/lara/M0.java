package lara;

class A1
	{
		static void A1()
			{
				System.out.println("from A1()");
			}
	}

class A2 extends A1
	{
		static void A1()
			{
				System.out.println("from A2()");
			}
	}

public class M0
	{
		public static void main(String[] args)
			{
				A1 a = new A2();
				a.A1();
				System.out.println("done");
			}
	}
