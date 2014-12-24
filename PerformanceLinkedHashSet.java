package PerformanceCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PerformanceLinkedHashSet
	{
		public static void main(String[] args)
		{

			int n = 1000000;
			long startTime;
			long endTime;
			long duration;

			LinkedHashSet<Integer> aLinkedHashSet = new LinkedHashSet<Integer>();
			// ADD
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				aLinkedHashSet.add(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aLinkedHashSet add:  " + duration);
			// GET
			// ITERATE
			startTime = System.nanoTime();
			Iterator<Integer> its = aLinkedHashSet.iterator();
			while (its.hasNext())
			{
				@SuppressWarnings("unused")
				int i = (int) its.next();
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aLinkedHashSet iterate:  " + duration);
			// REMOVE
			startTime = System.nanoTime();
			for (int i = n - 1; i > 0; i--)
			{
				aLinkedHashSet.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aLinkedHashSet remove:  " + duration);

			// GET
			long startLinkedHashSetGET = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				// int ii = (int) its.next();
				aLinkedHashSet.getClass();

			}
			long endtLinkedHashSetGET = System.nanoTime();
			duration = endtLinkedHashSetGET - startLinkedHashSetGET;
			System.out.println("LinkedHashSetGET get:  " + duration);

		}
	}
