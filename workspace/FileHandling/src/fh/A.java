package fh;

import java.io.File;
import java.io.IOException;

class A
	{
		public static void main(String[] args) throws IOException
			{
				File f = new File("cricket.txt");
				System.out.println(f.exists());// false
				f.createNewFile();
				System.out.println(f.exists());// true
				f.createNewFile();
				System.out.println(f.exists());// true

			}
	}
