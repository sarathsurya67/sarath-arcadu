package lara;

class B1
	{

	}

class B2 extends B1
	{

	}

class B3 extends B2
	{

	}

class B4 extends B3
	{

	}

public class M1
	{
		public static void main(String[] args)
			{
				B1 a1 = new B3();
				System.out.println(a1 instanceof Object);
				System.out.println(a1 instanceof B1);
				System.out.println(a1 instanceof B2);
				System.out.println(a1 instanceof B3);
				System.out.println(a1 instanceof B4);
				System.out.println("done");

			}
	}
