package Benchmark;

import java.util.concurrent.TimeUnit;

public class Short
	{
		/*
		 * byte, Byte short, Short int, Integer,
		 * AtomicInteger(mutable/changable), BigInteger(immutable) long Long
		 * AtomicLong float Float double Double BigDecimal(immutable) char
		 * String Character boolean Boolean
		 */
		public static void main(String[] args)
		{

			final long start = System.currentTimeMillis();
			long timeSecondsStart = TimeUnit.MILLISECONDS.toSeconds(start);
			Short sum = 0;

			// byte max = 255 ;
			for (int i = 0; i < 1_000_000_000; i++)
			{
				sum++;
			}
			final long finish = System.currentTimeMillis();

			long timeSecondsfinish = TimeUnit.MILLISECONDS.toSeconds(finish);
			System.out.println("Using int: " + sum + " Elapsed milliseconds: "
					+ (timeSecondsfinish - timeSecondsStart));

		}
	}
