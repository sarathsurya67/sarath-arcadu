package com.lara;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Manager30
	{
		public static void main(String[] args)
			{
				ArrayList list = new ArrayList();
				list.add(9);
				list.add(4);
				list.add(5);
				list.add(0);
				list.add(2);
				System.out.println(list);
				System.out.println("-------");
				Iterator it = list.iterator();
				while (it.hasNext())
					{
						System.out.print(it.next() + ",");
					}
				System.out.println();
				System.out.println("-------");
				ListIterator lit = list.listIterator();
				while (it.hasNext())
					{
						System.out.println(lit.next() + ",");
					}
			}
	}