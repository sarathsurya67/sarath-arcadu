package strings;

public class J1
	{
		public static void main(String[] args)
			{
				String s1 = null;
				System.out.println(s1);
			}
	}
// in println internally calling toString() ,if otherthan null.
// it is checking s1 is null or not if it is other than null then onlu=y calling
// toString().