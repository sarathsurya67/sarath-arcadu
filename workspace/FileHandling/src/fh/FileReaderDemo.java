package fh;

import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo
	{
		public static void main(String[] args) throws IOException
			{
				FileReader fr = new FileReader("cricket.txt");
				int i = fr.read();
				while (i != -1)
					{
						System.out.print((char) i);
						i = fr.read();
					}
			}
	}
