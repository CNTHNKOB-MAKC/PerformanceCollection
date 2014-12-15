package Wrapper;

public class LongL
	{

		public static void main(String[] args)
		{
			long lon = -9_223_372_036_854_775_808l;

			final long start = System.currentTimeMillis();

			for (int i = 0; i < 1_000_000_000; i++)
			{

				lon++;
			}

			final long finish = System.currentTimeMillis();

			System.out.println("Using long: " + lon + " Elapsed milliseconds: "
					+ (finish - start));

			Long lonL = -9_223_372_036_854_775_808l;

			final long start1 = System.currentTimeMillis();

			for (int i = 0; i < 1_000_000_000; i++)
			{

				lonL++;
			}

			final long finish1 = System.currentTimeMillis();

			System.out.println("Using LONG: " + lonL
					+ " Elapsed milliseconds: " + (finish1 - start1));
			System.out.println("The long is faster than the LONG by : "
					+ ((finish1 - start1) - (finish - start))
					+ "    milliseconds");
			double lngSpeed = (finish - start);
			double LNGSpeed = (finish1 - start1);
			System.out.println("OMG! long is " + (LNGSpeed / lngSpeed)
					+ "  times faster than LONG");
		}

	}
