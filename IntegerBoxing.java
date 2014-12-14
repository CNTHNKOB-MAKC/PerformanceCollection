package Wrapper;

import java.util.concurrent.TimeUnit;

class IntegerBoxing
	{
		private IntegerBoxing()
		{
			// TODO Auto-generated constructor stub
		}

		private IntegerBoxing(int sum)
		{ // TODO Auto-generated constructor stub
		}

		/*
		 * static int i = 123;
		 * 
		 * static Integer iObj = new Integer(i);
		 * 
		 * static int intPrim1 = 1 * 1000 * 1000 * 1006;
		 * 
		 * // static Integer intObj1 = new Integer(intPrim1);
		 * 
		 * static Integer iObject = Integer.valueOf(intPrim1);
		 * 
		 * Long IObject = new Long(848); static int iPrime = iObject.intValue();
		 */

		public static void main(String[] args)
		{
			{

				final long start = System.currentTimeMillis();
				long timeSecondsStart = TimeUnit.MILLISECONDS.toSeconds(start);
				int sum = 2147483647;
				int iPrim = 123;

				// Integer iObject = new Integer(iPrim);

				Integer sumf = new Integer(sum);
				System.out.println(sumf.toString());

				System.out.println(sum);
				// byte max = 255 ;
				for (int i = 0; i < 1_000_000_000; i++)
				{
					sum++;
				}
				final long finish = System.currentTimeMillis();

				long timeSecondsfinish = TimeUnit.MILLISECONDS
						.toSeconds(finish);
				System.out.println("Using int: " + sum
						+ " Elapsed milliseconds: "
						+ (timeSecondsfinish - timeSecondsStart));

			}
		}
	}
