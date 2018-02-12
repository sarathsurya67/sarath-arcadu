package strings2;

public class L
	{
		public static void main(String[] args)
			{
				StringBuffer sb = new StringBuffer();
				sb.append("hello1234");
				System.out.println(sb);
				sb.delete(2, 50);// no exception// deletes till to the
									// last//here not taking another object so
									// end index not imp
				System.out.println(sb);
			}
	}
