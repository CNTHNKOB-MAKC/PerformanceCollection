package PerformanceCollection;

import java.util.LinkedList;

public class PerformanceLinkedList
	{
		public static void main(String[] args)
		{

			int n = 1000;
			long startTime;
			long endTime;
			long duration;

			LinkedList<Integer> aLinkedList = new LinkedList<Integer>();
			// ADD
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				aLinkedList.add(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aLinkedList add:  " + duration);
			// GET
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++)
			{
				aLinkedList.get(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aLinkedList get:  " + duration);
			// REMOVE
			startTime = System.nanoTime();
			for (int i = n - 1; i > 0; i--)
			{
				aLinkedList.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("aLinkedList remove:  " + duration);
		}
	}
