package app1;

class C
	{
		int i;

		C(int i)
			{
				this.i = i;
			}
	}

public class Manager3
	{
		public static void main(String[] args)
			{
				C c1 = new C(90);
				String s1 = c1.toString();
				String s2 = "adress : " + c1;
				System.out.println(c1);
				System.out.println(s1);
				System.out.println(s2);
			}
	}
