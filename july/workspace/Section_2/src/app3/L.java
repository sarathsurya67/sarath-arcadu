package app3;

class L
	{
		static
			{
				System.out.println(" SIB - L ");
			}

		public static void main(String[] args)
			{
				System.out.println("L - Main");
			}
	}

class M
	{
		static
			{
				System.out.println(" SIB - M");
			}

		public static void main(String[] args)
			{
				System.out.println("M-Main Begin");
				L.main(args);
				System.out.println("M-Main end");
			}
	}
