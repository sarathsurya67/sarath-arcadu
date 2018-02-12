package fh;

import java.io.File;
import java.io.IOException;

public class Test
	{
		public static void main(String[] args) throws IOException
			{
				File f = new File("xyz.txt");
				System.out.println(f.exists());
				f.mkdir();
				System.out.println(f.exists());
				File f1 = new File("xyz.txt", "sarath.txt");
				System.out.println(f1.exists());
				f1.createNewFile();
				System.out.println(f1.exists());
				File f2 = new File("xyz.txt", "resume.txt");
				f2.createNewFile();
				System.out.println(f2.length());
				System.out.println(f2.getAbsolutePath());
				System.out.println(f2.list());
				File f5 = new File("IO.txt");
				System.out.println(f5.length());
			}
	}
