package Wrapper;

public class FloatF
	{

		public static void main(String[] args)
		{

			final long start = System.currentTimeMillis();

			float f = 99999999999999999999999999999999999999.999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999f;

			for (int i = 0; i < 1_000_000_000; i++)
			{
				f++;
			}

			final long finish = System.currentTimeMillis();
			System.out.println("Using float: " + f + " Elapsed milliseconds: "
					+ (finish - start));

			Float f1 = 99999999999999999999999999999999999999.999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999f;
			final long start1 = System.currentTimeMillis();
			for (int i = 0; i < 1_000_000_000; i++)
			{
				f1++;
			}

			final long finish1 = System.currentTimeMillis();
			System.out.println("Using FLOAT: " + f1 + " Elapsed milliseconds: "
					+ (finish1 - start1));
			System.out.println("The float is faster than the FLOAT by : "
					+ ((finish1 - start1) - (finish - start))
					+ "    milliseconds");
			double fltSpeed = (finish - start);
			double FLTSpeed = (finish1 - start1);
			System.out.println("OMG! float is " + (FLTSpeed / fltSpeed)
					+ "  times faster than FLOAT");

		}
	}
