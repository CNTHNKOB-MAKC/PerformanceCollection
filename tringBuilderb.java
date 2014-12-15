package Wrapper;

public class tringBuilderb
	{

		public static void main(String[] args)
		{

			final long start = System.currentTimeMillis();

			String string = "a";

			int max = 1_000000;

			for (int i = 0; i < max; i++)
			{

				string = string.concat("b");

			}

			final long finish = System.currentTimeMillis();

			final long result = (finish - start);

			System.out.println("Using String, elapsed milliseconds: " + result);

		}
	}
