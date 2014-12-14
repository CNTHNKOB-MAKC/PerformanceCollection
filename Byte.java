package Benchmark;

import java.util.concurrent.TimeUnit;
//import java.lang.Byte;
import java.lang.Integer;
import java.lang.Number;

public class Byte
	{
		public Byte(byte sum)
		{
			// TODO Auto-generated constructor stub
		}

		/*
		 * byte, Byte short, Short int, Integer,
		 * AtomicInteger(mutable/changable), BigInteger(immutable) long Long
		 * AtomicLong float Float double Double BigDecimal(immutable) char
		 * String Character boolean Boolean
		 */
		public static <byteObject1> void main(String[] args)
		{

			final long start = System.currentTimeMillis();
			long timeSecondsStart = TimeUnit.MILLISECONDS.toSeconds(start);
			byte sum = -128;
 Byte b = Byte.valueOf(sum);
Byte byteObject1 = new Byte(sum);

			// byte max = 255 ;
			for (int i = 0; i < 1_000_000_000; i++)
			{
				byteObject1 ;
			}
			final long finish = System.currentTimeMillis();

			long timeSecondsfinish = TimeUnit.MILLISECONDS.toSeconds(finish);
			System.out.println("Using byte: " + sum + " Elapsed  seconds: "
					+ (timeSecondsfinish - timeSecondsStart));
			System.out.println("Using byte: " + byteObject1 + " Elapsed milliseconds: "
					+ (finish - start));
		}
	}
