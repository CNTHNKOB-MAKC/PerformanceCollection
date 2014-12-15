package Wrapper;

class StringBufferS
	{

		public static void main(String[] args)
		{

			String s = "v";

			final long startd1 = System.currentTimeMillis();
			for (int i1 = 0; i1 < 1_00_000; i1++)
			{
				s = s.concat("d");

			}
			final long finishd1 = System.currentTimeMillis();
			final long resultd1 = (finishd1 - startd1);
			System.out.println("Using String, elapsed milliseconds: "
					+ resultd1);

			String ss = "s";
			StringBuffer sb = new StringBuffer(ss);
			final long start = System.currentTimeMillis();

			for (int i = 0; i < 1_000_00; i++)
			{

				// String sss = "c";
				sb.append("c");

			}
			final long finish = System.currentTimeMillis();
			final long result = (finish - start);
			System.out.println("Using StringBuffer, elapsed milliseconds: "
					+ result);

			StringBuilder sbldr = new StringBuilder(ss);

			final long start11 = System.currentTimeMillis();
			for (int i = 0; i < 1_000_00; i++)
			{
				// StringBuffer sss = new StringBuffer("e");
				sbldr.append("e");
			}
			final long finish11 = System.currentTimeMillis();

			final long result11 = (finish11 - start11);
			System.out.println("Using StringBuilder, elapsed milliseconds: "
					+ result11);
			double resulte = resultd1 / result;
			double result1 = resultd1 / result11;// //
			double result2 = result / result11;

			System.out.println("StringBuffer is " + resulte
					+ " times faster than String.");
			System.out.println("StringBuilder is " + result1
					+ " times faster than String.");
			System.out.println("StringBuilder is " + result2
					+ " times faster than StringBuffer.");

		}
	}
