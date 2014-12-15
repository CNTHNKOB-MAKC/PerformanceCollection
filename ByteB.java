package Wrapper;

class ByteB
	{

		public static void main(String[] args)
		{

			final long start = System.currentTimeMillis();
			byte b = -127;
			Byte c = b;

			/*
			 * in = (Integer) 222; Integer intObject = in1; Integer intObject1 =
			 * new Integer(in1); Integer intObject2 = Integer.valueOf(in1);
			 */

			for (int i = 0; i < 1_000_000_000; i++)
			{

				c++;

			}

			final long finish = System.currentTimeMillis();
			/*
			 * System.out.println(start); System.out.println(finish);
			 */
			System.out.println("Using BYTE: " + c + " Elapsed milliseconds: "
					+ (finish - start));

			final long start1 = System.currentTimeMillis();
			byte b1 = -128;

			for (int i = 0; i < 1_000_000_000; i++)
			{

				b1++;

			}

			final long finish1 = System.currentTimeMillis();
			/*
			 * System.out.println(start1); System.out.println(finish1);
			 */
			System.out.println("Using int: " + b1 + " Elapsed milliseconds: "
					+ (finish1 - start1));
			System.out.println("The byte is faster than the BYTE by : "
					+ ((finish - start) - (finish1 - start1))
					+ "    milliseconds");
			double BYTESpeed = (finish - start);
			double byteSpeed = (finish1 - start1);
			System.out.println("OMG! byte is " + (BYTESpeed / byteSpeed)
					+ "  times faster than BYTE");

			/* Primitive Data Type into the Wrapper classes */

			int in1 = 21113;
			int in = 213;

			// Number ONE
			in = (Integer) 222;
			// Number TWO
			Integer intObject = in1;
			// Number THREE
			Integer intObject1 = new Integer(in1);
			// Number FOUR
			Integer intObject2 = Integer.valueOf(in1);

			/* Wrapper classes into the Primitive Data Type */
			Long lonO = 32222321l;

			// Number One
			long lO = (long) lonO;
			// Number Two
			long lO1 = lonO.longValue();

			// Number Three
			long lO2 = lonO;

		}
	}
