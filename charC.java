package Benchmark;

public class charC
	{
		public static void main(String[] args)
		{
			final long start = System.currentTimeMillis();

			int inT = 111;

			Integer sum = 11;
			Integer iObject = new Integer(inT);
			Integer iObject1 = (int) inT;

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
