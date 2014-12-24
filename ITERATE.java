package PerformanceCollection;

import java.util.HashSet;
import java.util.Iterator;

public class ITERATE
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
			HashSet<Integer> aHashSet = new HashSet<Integer>();
			// ITERATE

			long startTimeLINKEDHashSetITERATEnanoTime = System.nanoTime();
			// startTimeLINKEDHashSetITERATE = System.currentTimeMillis();
			// Iterator<Integer> iIterator = aHashSet.iterator();

			Iterator its = aHashSet.iterator();
			/*
			 * public Iterator iterator(); we can create Iterator object by
			 * using iterator(); method of collection intetrface.
			 * 
			 * Iterator itr = C.iterator(); where C is any Collection Object
			 */
			while (its.hasNext())
			{
				// @SuppressWarnings("unused")
				int i1 = (int) its.next(); // or
				// Integer i = (Integer) its.next();
			}
			long endTimeLINKEDHashSetITERATEnanoTime = System.nanoTime();
			duration = endTimeLINKEDHashSetITERATEnanoTime
					- startTimeLINKEDHashSetITERATEnanoTime;
			System.out.println("LINKEDHashSetITERATE  nanoTime iterate:  "
					+ duration);
		}
	}