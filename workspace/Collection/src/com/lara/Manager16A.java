package com.lara;

import java.util.ArrayList;
import java.util.HashSet;

public class Manager16A
	{
		public static void main(String[] args)
			{
				ArrayList al = new ArrayList();
				al.add(90);
				al.add(90);
				al.add(90);
				al.add(40);
				al.add(40);
				al.add(40);
				HashSet hs = new HashSet(al);
				for (int i = 0; i < al.size(); i++)
					{
						if (!al.contains(90))
							{
								al.add(90);
							} else
							{

							}
						if (!al.contains(90))
							{
								al.add(90);
							}
						if (!al.contains(40))
							{
								al.add(40);
							}
					}
				System.out.println(al);
			}
	}
