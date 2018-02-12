package arrays2;

import java.util.Arrays;
import java.util.Comparator;

class Person
	{
		String name;
		int age;
		double weight;

		Person(String name, int age, double weight)
			{
				this.name = name;
				this.age = age;
				this.weight = weight;

			}

		@Override
		public String toString()
			{
				return "(" + name + " ," + age + "," + weight + ")";
			}

		static class sortBasedOnName implements Comparator
			{
				@Override
				public int compare(Object o1, Object o2)
					{
						Person p1 = (Person) o1;
						Person p2 = (Person) o2;
						return p1.name.compareTo(p2.name);
					}
			}

		static class sortBasedOnAge implements Comparator
			{
				@Override
				public int compare(Object o1, Object o2)
					{
						Person p1 = (Person) o1;
						Person p2 = (Person) o2;
						return p1.age - p2.age;
					}
			}

		static class sortBasedOnWeight implements Comparator
			{
				@Override
				public int compare(Object o1, Object o2)
					{
						Person p1 = (Person) o1;
						Person p2 = (Person) o2;
						return (int) (p1.weight - p2.weight);
					}
			}
	}

public class Manager8
	{
		public static void main(String[] args)
			{
				Person[] x =
					{ new Person("ma", 19, 89), new Person("re", 92, 58), new Person("tet", 30, 59),
							new Person("sfa", 24, 59), new Person("aer", 15, 33), new Person("sdd", 64, 64) };

				System.out.println(Arrays.toString(x));
				Arrays.sort(x, new Person.sortBasedOnName());
				System.out.println(Arrays.toString(x));
				Arrays.sort(x, new Person.sortBasedOnAge());
				System.out.println(Arrays.toString(x));
				Arrays.sort(x, new Person.sortBasedOnWeight());
				System.out.println(Arrays.toString(x));
			}
	}
