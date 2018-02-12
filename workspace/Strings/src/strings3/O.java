package strings3;

public class O
	{
		public static void main(String[] args)
			{
				E.find("a1b2c3d45e89&97%26", "\\d");// every digit from 0 to 9
				System.out.println("-------------");
				E.find("a1b2c3d45e89&97%26", "\\d+");// 1 0r more than one(min
														// 1,sequence numbers)
				System.out.println("-------------");
			}
	}
