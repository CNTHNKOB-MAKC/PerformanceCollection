package Benchmark;

import java.util.concurrent.TimeUnit;
//import java.lang.Integer;
//import java.lang.Number;

public class Integer
	{

		// how to convert primitive data type into the wrapper class=object

		/*
		 * byte, Byte short, Short int, Integer,
		 * AtomicInteger(mutable/changable), BigInteger(immutable) long Long
		 * AtomicLong float Float double Double BigDecimal(immutable) char
		 * String Character boolean Boolean
		 */
		/*
		 * private Integer(int intPrim1) { // TODO Auto-generated constructor
		 * stub }
		 */

		private Integer()
		{
			// TODO Auto-generated constructor stub
		}

		public Integer(int sum)
		{ // TODO Auto-generated constructor stub
		}

		public static void main(String[] args)
		{

			final long start = System.currentTimeMillis();
			long timeSecondsStart = TimeUnit.MILLISECONDS.toSeconds(start);
			int sum = 2147483647;
			int iPrim = 123;

			// Integer iObject = new Integer(iPrim);

			Integer sumf = new Integer(sum);

			Integer iObjecto = (int) sum;

			System.out.println(sumf.toString());

			System.out.println(sum);
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
