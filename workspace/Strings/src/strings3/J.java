package strings3;

public class J
	{
		public static void main(String[] args)
			{
				E.find("abfdrghsbvgdyuhsbcvs", "[bj]");// ervery occurence of b
														// and j
				System.out.println("----------------------------");
				E.find("abfdrghsbvgdyuhsbcvs", "[b-j]");// range of
														// characters[b-j](b,c,d,e,f,g,h,i,j).
			}
	}
