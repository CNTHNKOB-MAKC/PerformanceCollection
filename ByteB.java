package Wrapper;

public class ByteB
	{

		public static void main(String[] args)
		{

			Integer in = 1234;

			Integer inter = new Integer(4321);

			if (in == inter)
			{
				System.out.println("same plase");

			}
			else
				System.out
						.println("one is in one place on the heap, the other one is in the different heap");
			System.out.println(in);
			System.out.println(inter);

		}

	}
