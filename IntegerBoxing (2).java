package Wrapper;

import java.util.concurrent.TimeUnit;

class IntegerBoxing
	{

		public static void main(String[] args)
		{
			{

				final long start = System.currentTimeMillis();
				long timeSecondsStart = TimeUnit.MILLISECONDS.toSeconds(start);
				int sum = -2147483648;

				Integer sumf = new Integer(sum);

				for (int i = 0; i < 1_000_000_000; i++)
				{
					sumf++;
				}
				final long finish = System.currentTimeMillis();

				long timeSecondsfinish = TimeUnit.MILLISECONDS
						.toSeconds(finish);
				/*
				 * System.out.println("Using Integer: " + sumf +
				 * " Elapsed      seconds: " + (timeSecondsfinish -
				 * timeSecondsStart));
				 */
				System.out.println("Using Integer: " + sumf
						+ " Elapsed milliseconds: " + (finish - start));

				final long start1 = System.currentTimeMillis();
				long timeSecondsStart1 = TimeUnit.MILLISECONDS.toSeconds(start);
				int sumf1 = -2147483648;

				for (int i = 0; i < 1_000_000_000; i++)
				{
					sumf1++;
				}
				final long finish1 = System.currentTimeMillis();

				long timeSecondsfinish1 = TimeUnit.MILLISECONDS
						.toSeconds(finish);
				/*
				 * System.out.println("Using Integer: " + sumf1 +
				 * " Elapsed      seconds: " + (timeSecondsfinish1 -
				 * timeSecondsStart1));
				 */
				System.out.println("Using Integer: " + sumf1
						+ " Elapsed milliseconds: " + (finish1 - start1));
				System.out.println("The int is faster than the INTEGER by : "
						+ ((finish - start) - (finish1 - start1))
						+ "    milliseconds");
			}
		}
	}
