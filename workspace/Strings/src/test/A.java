package test;

public class A
	{
		public static void main(String[] args)
			{
				String s1 = new String("java strings");
				String s2 = new String("java StringBuffer");
				String s3 = new String("     String with Spaces     ");
				String s4 = new String("java strings");
				s1.concat("is immutable");
				System.out.println("-------------------------------------");
				System.out.println("s1 = " + s1);
				System.out.println("s2 = " + s2);
				System.out.println("s3 = " + s3);
				System.out.println("s4 = " + s4);
				System.out.println("s1.length() = " + s1.length());
				System.out.println("s1.charAt(9) = " + s1.charAt(9));
				System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));
				System.out.println("s1.equals(s2)= " + s1.equals(s2));
				System.out.println("s1.equals(s4)= " + s1.equals(s4));
				System.out.println("s1.indexOf(s1) =  " + s1.indexOf('s'));
				System.out.println("s1.replace(c1 with c2) = " + s2.replace("String", "str"));
				System.out.println("s1.substring(5) = " + s1.substring(5));
				System.out.println("s1.substring(5,11) = " + s1.substring(5, 11));
				System.out.println("s3.trim() = " + s3.trim());
				System.out.println("s1 == s2 = " + s1 == s2);
				System.out.println("s1 == s4 = " + s1 == s4);
				System.out.println("*****************************");

				String s6 = "";
				StringBuffer sb = new StringBuffer("String buffer");
				sb.append(" is muatble");
				System.out.println("sb = " + sb);
				StringBuffer sb2 = new StringBuffer("htaras");
				System.out.println("sb2 = " + sb2);
				System.out.println("sb.insert(24, 'objects') =  " + sb.insert(24, " objects is basic"));
				System.out.println("sb.delete(31,41) = " + sb.delete(32, 41));
				System.out.println("sb2.reverse() = " + sb2.reverse());
				System.out.println("sb2.toString() : " + sb2.toString());
				s6 = sb2.toString();
				System.out.println(s6);
				System.out.println("sb.replace(7, 12, 'Buffer') = " + sb.replace(7, 12, "Buffer"));
				System.out.println("sb.substring(4) = " + sb.substring(4));
				System.out.println("sb.substring(4,15) = " + sb.substring(4, 15));

			}

	}
