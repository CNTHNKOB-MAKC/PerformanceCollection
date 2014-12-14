package Benchmark;

import java.util.concurrent.TimeUnit;

public class shortS
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
			short sum = -32_768;

			// byte max = 255 ;
			for (int i = 0; i < 1_000_000_000; i++)
			{
				sum++;
			}
			final long finish = System.currentTimeMillis();

			long timeSecondsfinish = TimeUnit.MILLISECONDS.toSeconds(finish);
			System.out.println("Using short: " + sum + " Elapsed  seconds: "
					+ (timeSecondsfinish - timeSecondsStart));
			System.out.println("OR in milliseconds");
			System.out.println("Using short: " + sum
					+ " Elapsed milliseconds: " + (finish - start));
			// System.out.println("short - adding value to itself  sum:  " + "="
			// / + sum);

		}
	}
