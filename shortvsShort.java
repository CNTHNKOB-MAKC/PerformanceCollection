package Benchmark;
import java.util.ArrayList;
import java.util.List;
public class shortvsShort
	{
		public static void main(String[] args) {   
			
			final long start = System.currentTimeMillis();
		 
        short sum = 0;
             double max1 = 1_000_000_000;
              for (int i = 0; i < max1; i++)  {  
                      sum++;
                                             }
        final long finish = System.currentTimeMillis();
        
System.out.println(start);
System.out.println( finish);
System.out.println("Using int: " + sum + " Elapsed milliseconds: " + (finish - start));
	}
	}
