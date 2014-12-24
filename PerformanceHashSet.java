package PerformanceCollection;

import java.util.HashSet;
import java.util.Iterator;

public class PerformanceHashSet
	{
		public static void main(String[] args)
		{

			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			HashSet<Integer> tHashSet = new HashSet<Integer>();
			// ADD
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				tHashSet.add(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("tHashSet add:  " + duration);
			// ITERATE
			startTime = System.nanoTime();
			Iterator<Integer> its = tHashSet.iterator();
			while (its.hasNext())
			{
				@SuppressWarnings("unused")
				int i = (int) its.next();
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("tHashSet iterate:  " + duration);
			// REMOVE
			startTime = System.nanoTime();
			for (int i = n - 1; i > 0; i--)
			{
				tHashSet.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("tHashSet remove:  " + duration);

			// GET
			long startHashSet = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				// int ii = (int) its.next();
				tHashSet.getClass();

			}
			long endHashSetGET = System.nanoTime();
			duration = endHashSetGET - startHashSet;
			System.out.println("HashSetGET get:  " + duration);
		}
	}
