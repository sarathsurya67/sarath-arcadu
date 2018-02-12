package app1;

public class M4
	{
		public static void main(String[] args)
			{
				boolean b1 = false;// prim
				Boolean b2 = new Boolean(b1);// rv,Boxing
				Boolean b3 = new Boolean(true);// rv,Boxing
				Boolean b4 = b2.booleanValue();// primitives,UnBoxing
				Boolean b5 = b3.booleanValue();// prim,UnBoxing
				System.out.println("Done");
			}
	}
