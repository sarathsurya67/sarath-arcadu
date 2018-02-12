package lara;

class Manager31
	{
		static void test(Object i)
			{
				if (i instanceof A)
					{
						System.out.println("V can cast into A");
						A a1 = (A) i;
					}
				if (i instanceof B)
					{
						System.out.println("V can cast into B");
						B b1 = (B) i;
					}
				if (i instanceof C)
					{
						System.out.println("V can cast into C");
						C c1 = (C) i;
					}
				if (i instanceof D)
					{
						System.out.println("V can cast into D");
						D d1 = (D) i;
					}
				System.out.println("-----------");
			}

		public static void main(String[] args)
			{
				A a1 = new A();
				A a2 = new B();
				A a3 = new C();
				A a4 = new D();
				test(a1);
				test(a2);
				test(a3);
				test(a4);

			}
	}
