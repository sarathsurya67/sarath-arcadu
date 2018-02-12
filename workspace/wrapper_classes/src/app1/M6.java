package app1;

public class M6
	{
		public static void main(String[] args)
			{
				String s1 = "9.989";
				Double d1 = new Double(s1);// Boxing to double obj, . is allowed
											// in Float&Double.
				double d2 = d1.doubleValue();// un Boxing
				System.out.println("done");
			}
	}
