package app3;

class J
	{
		static
			{
				System.out.println(" J-SIB1 ");
			}

		public static void main(String[] args)
			{
				System.out.println("J-Main");
			}
	}

class K
	{
		static
			{
				System.out.println("K-SIB1");
			}

		public static void main(String[] args)
			{
				System.out.println("K-Main");
			}

		static
			{
				System.out.println("K-SIB2");
			}
	}
