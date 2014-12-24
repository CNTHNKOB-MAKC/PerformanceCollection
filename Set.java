package PerformanceCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Set
	{
		public static void main(String[] args)
		{

			int n = 1000000;

			long duration;

			long startTimeHashSetADD;
			long startTimeHashSetITERATE;
			long startTimeHashSetREMOVE;

			long endTimeHashSetADD;
			long endTimeHashSetITERATE;
			long endTimeHashSetREMOVE;

			HashSet aHashSet = new HashSet();
			// ADD
			// startTime = System.nanoTime();
			startTimeHashSetADD = System.currentTimeMillis();
			long timeSecondsStart = TimeUnit.MILLISECONDS
					.toSeconds(startTimeHashSetADD);

			for (int i = 0; i < n; i++)
			{
				aHashSet.add(i);
			}
			// endTime = System.nanoTime();

			endTimeHashSetADD = System.currentTimeMillis();
			long timeSecondsEnd = TimeUnit.MILLISECONDS
					.toSeconds(endTimeHashSetADD);

			duration = endTimeHashSetADD - startTimeHashSetADD;
			System.out.println("HashSetADD add:  " + duration);
			// GET
			// ITERATE
			startTimeHashSetITERATE = System.currentTimeMillis();
			Iterator<Integer> its = aHashSet.iterator();
			while (its.hasNext())
			{
				@SuppressWarnings("unused")
				int i = (int) its.next();
			}
			// endTimeHashSetITERATE = System.nanoTime();
			endTimeHashSetITERATE = System.currentTimeMillis();

			duration = endTimeHashSetITERATE - startTimeHashSetITERATE;
			System.out.println("HashSetITERATE iterate:  " + duration);
			// REMOVE
			startTimeHashSetREMOVE = System.currentTimeMillis();

			for (int i = n - 1; i > 0; i--)
			{
				aHashSet.remove(i);
			}
			endTimeHashSetREMOVE = System.currentTimeMillis();
			duration = endTimeHashSetREMOVE - startTimeHashSetREMOVE;
			System.out.println("HashSetREMOVE remove:  " + duration + "\n");

			long startTimeLINKEDHashSetADD;
			long startTimeLINKEDHashSetITERATE;
			long startTimeLINKEDHashSetREMOVE;

			long endTimeLINKEDHashSetADD;
			long endTimeLINKEDHashSetITERATE;
			long endTimeLINKEDHashSetREMOVE;
			// ADD

			LinkedHashSet<Integer> aLinkedHashSet = new LinkedHashSet<Integer>();

			startTimeLINKEDHashSetADD = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				aLinkedHashSet.add(i);
			}
			endTimeLINKEDHashSetADD = System.currentTimeMillis();
			duration = endTimeLINKEDHashSetADD - startTimeLINKEDHashSetADD;
			System.out.println("LINKEDHashSetADD add:  " + duration);
			// ITERATE

			long startTimeLINKEDHashSetITERATEnanoTime = System.nanoTime();
			// startTimeLINKEDHashSetITERATE = System.currentTimeMillis();
			Iterator<Integer> iIterator = aLinkedHashSet.iterator();
			while (its.hasNext())
			{
				@SuppressWarnings("unused")
				int i = (int) iIterator.next();
			}
			long endTimeLINKEDHashSetITERATEnanoTime = System.nanoTime();
			duration = endTimeLINKEDHashSetITERATEnanoTime
					- startTimeLINKEDHashSetITERATEnanoTime;
			System.out.println("LINKEDHashSetITERATE  nanoTime iterate:  "
					+ duration);
			// REMOVE
			startTimeLINKEDHashSetREMOVE = System.currentTimeMillis();
			for (int i = n - 1; i > 0; i--)
			{
				aLinkedHashSet.remove(i);
			}
			endTimeLINKEDHashSetREMOVE = System.currentTimeMillis();
			duration = endTimeLINKEDHashSetREMOVE
					- startTimeLINKEDHashSetREMOVE;
			System.out.println("LINKEDHashSetREMOVE  remove:  " + duration
					+ "\n");

			long startTimeTreeSetADD;
			long startTimeTreeSetITERATE;
			long startTimeTreeSetREMOVE;

			long endTimeTreeSetADD;
			long endTimeTreeSetITERATE;
			long endTimeTreeSetREMOVE;

			TreeSet<Integer> ts = new TreeSet<Integer>();
			// ADD
			startTimeTreeSetADD = System.currentTimeMillis();
			for (int i = 0; i < n; i++)
			{
				ts.add(i);
			}
			endTimeTreeSetADD = System.currentTimeMillis();

			duration = endTimeTreeSetADD - startTimeTreeSetADD;
			System.out.println("TreeSet add:  " + duration);
			// ITERATE

			long startTimeTreeSetITERATEnanoTime = System.nanoTime();

			// startTimeTreeSetITERATE = System.currentTimeMillis();
			Iterator<Integer> itIterator = ts.iterator();
			while (its.hasNext())
			{
				@SuppressWarnings("unused")
				int i = (int) itIterator.next();
			}

			long endTimeTreeSetITERATEnanoTime = System.nanoTime();
			// endTimeTreeSetITERATE = System.currentTimeMillis();
			duration = endTimeTreeSetITERATEnanoTime
					- startTimeTreeSetITERATEnanoTime;
			System.out.println("TreeSetITERATE nanoTime iterate:  " + duration);
			// REMOVE
			startTimeTreeSetREMOVE = System.currentTimeMillis();
			for (int i = n - 1; i > 0; i--)
			{
				ts.remove(i);
			}
			endTimeTreeSetREMOVE = System.currentTimeMillis();
			duration = endTimeTreeSetREMOVE - startTimeTreeSetREMOVE;
			System.out.println("TreeSetREMOVE remove:  " + duration);

		}
	}
