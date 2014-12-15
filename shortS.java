package Wrapper;

import java.util.concurrent.TimeUnit;

class ShortS
	{

		public static void main(String[] args)
		{
			Short s = -127;

			final long start = System.currentTimeMillis();
			long timeSecondsStart = TimeUnit.MILLISECONDS.toSeconds(start);

			for (int i = 0; i < 1_000_000_000; i++)

			{
				s++;

			}

			final long finish = System.currentTimeMillis();
			long timeSecondsFinish = TimeUnit.MILLISECONDS.toSeconds(start);

			System.out.println("Using SHORT: " + s + " Elapsed milliseconds: "
					+ (finish - start) + " or "
					+ (timeSecondsFinish - timeSecondsStart) + " seconds");

			short s1 = -127;

			final long start1 = System.currentTimeMillis();
			long timeSecondsStart1 = TimeUnit.MILLISECONDS.toSeconds(start1);

			for (int i = 0; i < 1_000_000_000; i++)

			{
				s1++;

			}

			final long finish1 = System.currentTimeMillis();
			long timeSecondsFinish1 = TimeUnit.MILLISECONDS.toSeconds(finish1);

			System.out.println("Using short: " + s1 + " Elapsed milliseconds: "
					+ (finish1 - start1));
			System.out.println("The short is faster than the SHORT by : "
					+ ((finish - start) - (finish1 - start1))
					+ "    milliseconds");
			double SHRTSpeed = (finish - start);
			double shrtSpeed = (finish1 - start1);
			System.out.println("OMG! short is " + (SHRTSpeed / shrtSpeed)
					+ "  times faster than SHORT");

		}

	}
