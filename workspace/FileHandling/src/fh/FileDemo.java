package fh;

import java.io.File;
import java.io.IOException;

class FileDemo
	{
		public static void main(String[] args) throws IOException
			{
				File f = new File("cricket123");
				System.out.println(f.exists());// false
				f.mkdir();
				System.out.println(f.exists());// true
			}
	}
