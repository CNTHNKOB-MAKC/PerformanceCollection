package PerformanceCollection;

import java.util.ArrayList;

public class List
	{
		public static void main(String[] args)
		{
			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			// ADD
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				arrayList.add(i);
				System.out.println("ArrayList add:  " + arrayList.add(i));
			}

		}
	}