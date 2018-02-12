package arrays1;

public class N
	{
		public static void main(String[] args)
			{
				int[] x = new int[2];
				x[0] = 10;
				Object y = x;
				// y[1] = 20;// it is object type so no indexes.
				// The type of the expression must be an array type but it
				// resolved to Object

				int[] z = (int[]) y;
				z[1] = 30;
				System.out.println("done");
			}
	}
