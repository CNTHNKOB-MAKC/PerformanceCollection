package Benchmark;
import java.util.ArrayList;
	import java.util.List;

 
	//AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, Short
	//byte, double, float, int, long, and short
public class Benchmarking {
 
		
		
		
		
		
		public static void main(String[] args) { 
			 
			final long start = System.currentTimeMillis();
	        short sum = 0;
	              int max = 1_000_000_000;
	              for (int i = 0; i < max; i++)  {  
	                      sum++;
	                                             }
	        final long finish = System.currentTimeMillis();
	        
	System.out.println(start	);
	System.out.println( finish);
	System.out.println("Using int: " + sum + " Elapsed milliseconds: " + (finish - start));

		
	/*
	    final long start1 = System.currentTimeMillis();

	    Byte sum1 = 0;
	           int max1 = 1_000_000_000;
	           for (int i = 0; i < max1; i++) {
	                 sum1++;                 
	                                         }
	   final long finish1 = System.currentTimeMillis();
	   System.out.println(start1	);
	   System.out.println( finish1);
	System.out.println("Using Integer: " + sum1 + " Elapsed milliseconds: " + (finish1 - start1));
	*/
			
			
			
	}

	}

 