package Benchmark;

public class doubleD
	{
		public static void main(String[] args)
		{
			final long start = System.currentTimeMillis();
			double sum = 888888888888888888.8888888888888888888888888888888888888888d;

			int max = 1_000_000_000;

			for (int i = 0; i < max; i++)
			{

				sum++;

			}

			final long finish = System.currentTimeMillis();

			System.out.println("Using double:  " + sum
					+ "   Elapsed time in milliseconds  " + (finish - start));

		}
	}
