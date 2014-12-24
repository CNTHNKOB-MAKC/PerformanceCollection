package PerformanceCollection;

import java.util.Vector;

public class PerformanceVector
	{
		public static void main(String[] args)
		{
			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			Vector<Integer> aVector = new Vector<Integer>();
			// ADD
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				aVector.add(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aVector add:  " + duration);
			// GET
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				aVector.get(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aVector get:  " + duration);
			// REMOVE
			startTime = System.nanoTime();
			for (int i = n - 1; i > 0; i--)
			{
				aVector.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aVector remove:  " + duration);
		}
	}
