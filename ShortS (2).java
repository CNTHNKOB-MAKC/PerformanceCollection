package Wrapper;

class ShortS
	{

		public static void main(String[] args)
		{
			// BOXING//
			int n1 = 8;
			Integer n2 = n1;

			Integer.valueOf(n1);

			// System.out.println(n1);
			System.out.println(Integer.valueOf(n1));

			// UNBOXING//

			Integer num1 = 667;
			int num2 = num1;

			// int x = num1.intValue();
			System.out.println(num1.intValue());

		}
	}
