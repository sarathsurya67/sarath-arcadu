package arrays1;

public class L
	{
		public static void main(String[] args)
			{
				int[] x = new int[2];// abandoned
				int[] y = new int[3];
				x = y;// compiler checking DT of x and y
				y = x;// no effect
				System.out.println("Done");
			}
	}
