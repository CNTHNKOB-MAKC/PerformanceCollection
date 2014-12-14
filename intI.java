package Benchmark;

public class intI
	{
		public static void main(String[] args)
		{

			final long start = System.currentTimeMillis();

			int sum = -2_147_483_648;

			int maxFinish = 1_000_000_000;
			for (int i = 0; i < maxFinish; i++)
			{

				sum++;
			}
			final long finish = System.currentTimeMillis();
			System.out.println("Using int:  " + sum
					+ "   Elapsed milliseconds:" + (finish - start));

		}
	}
