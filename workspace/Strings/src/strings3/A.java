package strings3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A
	{
		public static void main(String[] args)
			{
				String s1 = "abcbc909c";
				String s2 = "c";
				Pattern p1 = Pattern.compile(s2);
				Matcher m1 = p1.matcher(s1);// all the matches of pattern in the
											// source.
				while (m1.find())// find() true if match is there

					{
						System.out.println(m1.start());// start() returns index
					}
			}

	}
