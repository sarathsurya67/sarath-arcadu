package arrays1;

public class M
	{
		public static void main(String[] args)
			{
				int[] x = new int[2];
				int[] y = x;
				Object obj = y;// 1
				int[] z = (int[]) obj;// 2
				System.out.println("done");
			}
	}
/*
 *
 *
 */