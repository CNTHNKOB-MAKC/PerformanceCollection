package Benchmark;

public class longL
	{
		public static void main(String[] args)
		{
			final long start = System.currentTimeMillis();

			long sum = -9_223_372_036_854_775_808l;
			// long sum = 100000000000000000l;

			int max = 1_000_000_000;
			for (int i = 0; i < max; i++)
			{

				sum++;
			}
			final long finish = System.currentTimeMillis();
			System.out.println(start);
			System.out.println(finish);
			System.out.println("Using int:  " + sum
					+ "  Elapsed millliseconds:  " + (finish - start));

		}
	}
