package strings2;

public class H
	{
		public static void main(String[] args)
			{
				StringBuffer sb = new StringBuffer();
				System.out.println(sb.capacity());
				sb.append("abc");
				sb.append("abc");
				System.out.println(sb.capacity());
				sb.trimToSize();// removing unoccupied Spaces.
				System.out.println(sb.capacity());
				System.out.println(sb.length());
			}
	}
