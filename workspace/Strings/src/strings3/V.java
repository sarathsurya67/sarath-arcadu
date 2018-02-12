package strings3;

public class V
	{
		public static void main(String[] args)
			{
				String s1 = "x0  u0 y2 h5 p6 d4";
				String s2 = "[a-p][2-8]";// first letter b/w a to p and second
											// letter b/w 2 to 8
				E.find(s1, s2);
			}
	}
