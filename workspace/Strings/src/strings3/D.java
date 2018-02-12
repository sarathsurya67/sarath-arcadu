package strings3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D
	{
		public static void main(String[] args)
			{
				String s1 = "123donehelloagain456";
				String s2 = "e";
				Pattern p1 = Pattern.compile(s2);
				Matcher m1 = p1.matcher(s1);
				while (m1.find())

					{
						System.out.print(m1.group());// returns exp we r
						// searching
						System.out.print(" @ ");
						System.out.println(m1.start());
					}
			}

	}
