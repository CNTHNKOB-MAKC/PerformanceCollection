package Benchmark;

public class floatF
	{
		public static void main(String[] args)
		{
			final long start = System.currentTimeMillis();

			float sum = 9999999999999999999999999.999999999999999999999999999999999999999f;
			// looks like float has no limit in number of digits from either
			// side(before and after the dot)
			int max = 1_000_000_000;

			for (int i = 0; i < max; i++)
			{
				sum++;

			}

			final long finish = System.currentTimeMillis();

			System.out.println("Using long: " + sum + " Elapsed milliseconds: "
					+ (finish - start));
		}
	}
