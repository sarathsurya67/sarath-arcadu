package app1;

class H
	{
		int x;

		@Override
		public String toString()
			{
				return " x = " + x;
			}
	}

class I
	{
		int y;
		H h1;

		@Override
		public String toString()
			{
				return h1 + " , y = " + y;
			}
	}

public class Manager8
	{
		public static void main(String[] args)
			{
				H h1 = new H();
				h1.x = 10;

				I i1 = new I();
				i1.y = 20;
				i1.h1 = h1;
				System.out.println(h1);
				System.out.println(i1);
			}
	}
