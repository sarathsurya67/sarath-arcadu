package lara;

class A3
	{
		int i = 20;
		static int j = 30;
	}

class A4 extends A3
	{
		int k = 202;
		static int l = 310;
	}

class A5 extends A4
	{
		int m = 72;
		static int n = 76;
	}

public class M2
	{
		public static void main(String[] args)
			{
				A3 a1 = new A4();
				System.out.println(a1.i);
				System.out.println(a1.j);
				System.out.println(a1.k);
				System.out.println(a1.l);
			}
	}
