package fh;

import java.io.File;
import java.io.IOException;

class FileDemo1
	{
		public static void main(String[] args) throws IOException
			{
				File f1 = new File("E://sarath67");
				f1.mkdir();
				File f2 = new File("E://sarath67", "resume.txt");
				f2.createNewFile();
			}
	}
