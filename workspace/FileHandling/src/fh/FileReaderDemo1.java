package fh;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo1
	{
		public static void main(String[] args) throws IOException
			{
				File f = new File("cricket.txt");
				FileReader fr = new FileReader(f);
				char[] ch = new char[(int) f.length()];
				fr.read(ch);
				for (char ch1 : ch)
					{
						System.out.print(ch1);
					}
			}
	}
