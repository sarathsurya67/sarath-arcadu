package app1;

public class M7
	{
		public static void main(String[] args)
			{
				String s1 = "10Z";
				Byte b1 = new Byte(s1);// Number FormatException
				Byte b2 = b1.byteValue();
				System.out.println("done");

			}
	}
