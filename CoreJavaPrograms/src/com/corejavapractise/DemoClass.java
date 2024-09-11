package com.corejavapractise;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class DemoClass {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string: ");
//		String str = scan.nextLine();
//		StringBuilder sb = new StringBuilder(str);
//
//		for (int i = 0; i < sb.length() - 1; i++) {
//			if (sb.charAt(i) == ' ') {
//				sb.setCharAt(i + 1, 'A');
//			}
//		}
//
//		System.out.println(sb.toString());
//		scan.close();
//	}

		// Arraylist

//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add("Raj");
//		al.add(20.30);
//		al.add(3.147f);
//		al.add(true);
//		
//		System.out.println(al);

//		//Linked list
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		ll.add(40);
//		ll.add("Raj");
//		ll.add(20.30);
//		ll.add(3.147f);
//		ll.add(true);
//
//		System.out.println(ll);

		// some inbuilt functions in arraylist

//		ArrayList al1 = new ArrayList();
//		al1.add(10);
//		al1.add(20);
//		al1.add(30);
//		al1.add(40);
//		al1.add(50);
//		System.out.println("al1---->" + al1);
//		System.out.println("----------------------");
//
//		ArrayList al2 = new ArrayList();
//		al2.add(10);
//		al2.add(20);
//		al2.add(300);
//		al2.add(400);
//		al2.add(500);
//		System.out.println("al2---->" + al2);
//		System.out.println("----------------------");
//
//		al2.addAll(al1);
//		System.out.println("al2---->" + al2);
//		System.out.println("----------------------");
////		
////		ArrayList al3 = new ArrayList();
////		al3.add(1);
////		al3.add(2);
////		al3.add(3);
////		al3.add(4);
////		al3.add(5);
////		System.out.println("al3---->" + al3);
////		System.out.println("----------------------");
////		al3.add(2, 999);
////		System.out.println("al3---->" + al3);
////		System.out.println("----------------------");
////		System.out.println(al3.contains(999));
////		System.out.println("----------------------");
////		System.out.println(al3.contains(100));
////		System.out.println("----------------------");
////		System.out.println(al2.containsAll(al1));
////		System.out.println("----------------------");
////		System.out.println(al2.get(5));
////		System.out.println("----------------------");
////		System.out.println(al2.containsAll(al3));
////		System.out.println("----------------------");
////		System.out.println(al2.indexOf(20));
////		System.out.println("----------------------");
////		System.out.println(al3.isEmpty());
////		System.out.println("----------------------");
////		System.out.println(al3.size());
////		al3.clear();
////		System.out.println("----------------------");
////		System.out.println(al3.isEmpty());
////		System.out.println("----------------------");
////		System.out.println(al3.size());
//
//		al1.retainAll(al2);
//		System.out.println("al1---->" + al1);
//		System.out.println("----------------------");
//		al1.add(100);
//		al1.add(200);
//		System.out.println("al1---->" + al1);
//		System.out.println("----------------------");
//		al1.add(2, 999);
//		System.out.println("al1---->" + al1);
//		System.out.println("----------------------");
//		al1.set(4, 1000);
//		System.out.println("al1---->" + al1);
//		System.out.println("----------------------");

//		//Array deque
//		ArrayDeque ad= new ArrayDeque();
//		ad.add(100);
//		ad.add(200);
//		ad.add(300);
//		ad.add(400);
//		ad.addFirst(999);
//		ad.addLast(9999);
//		System.out.println(ad);

		// Linked list
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		ll.add(40);
//		ll.add("Raj");
//		ll.add(20.30);
//		ll.add(3.147f);
//		ll.add(true);
//		ll.addFirst(988);
//		ll.addLast(1000);
//		ll.add(2, 66);
//		System.out.println(ll);

		// some inbuilt functions in LikedList

//		LinkedList ll = new LinkedList();
//		ll.add(100);
//		ll.add(200);
//		ll.add(300);
//		ll.add(400);
//		ll.add(500);
//		System.out.println("ll---> " + ll);
//		LinkedList ll2 = new LinkedList();
//		ll2.add(100);
//		ll2.add(200);
//		ll2.add(300);
//		ll2.add(400);
//		ll2.add(500);
//		System.out.println("ll2---> " + ll2);
//		ll2.addAll(ll);
//		ll2.addLast(1000);
//		System.out.println("ll2---> " + ll2);
//		System.out.println(ll.getFirst());
//		System.out.println(ll.get(3));
//		System.out.println(ll.getLast());
//		System.out.println(ll.getClass());
//		System.out.println(ll.toString());
//		System.out.println(ll.descendingIterator());
//		System.out.println(ll.clone());
//		System.out.println(ll.contains(200));
//		System.out.println(ll.containsAll(ll2));
//		System.out.println(ll.element());
//		System.out.println(ll.equals(999));
//		System.out.println(ll.hashCode());
//		System.out.println(ll.indexOf(200));
//		System.out.println(ll.isEmpty());
//		System.out.println(ll.lastIndexOf(1000));
//		System.out.println(ll.offer(300));
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.offerFirst(300));
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.offerLast(999));
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.peek());
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.peekFirst());
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.peekLast());
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.poll());
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.pollFirst());
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.pollLast());
//		System.out.println("ll---> " + ll);
//		ll.push(30);
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.pop());
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.remove(3));
//		System.out.println("ll---> " + ll);
////		System.out.println(ll2.retainAll(ll));
////		System.out.println("ll---> " + ll);
////		System.out.println(ll.removeAll(ll2));
//		System.out.println("ll---> " + ll);
//		System.out.println(ll.set(1, 1000));
//		System.out.println("ll---> " + ll);
//		ll.clear();
//		System.out.println(ll.size());
//		System.out.println(ll.isEmpty());

		// Priority queue

//		PriorityQueue pq= new PriorityQueue();
//		pq.add(100);
//		pq.add(30);
//		pq.add(127);
//		pq.add(60);
//		pq.add(200);
//		pq.add(25);
//		pq.add(50);
//		System.out.println(pq);

		// Tree set

//		TreeSet ts = new TreeSet();
//		ts.add(10);
//		ts.add(20);
//		ts.add(90);
//		ts.add(40);
//		ts.add(79);
//		ts.add(35);
//		ts.add(100);
//		System.out.println(ts);
//		System.out.println(ts.headSet(79));
//		System.out.println(ts);
//		System.out.println(ts.tailSet(10));
//		System.out.println(ts);
//		System.out.println(ts.ceiling(30));
//		System.out.println(ts);
//		System.out.println(ts.floor(30));
//		System.out.println(ts);
//		System.out.println(ts.higher(35));
//		System.out.println(ts);
//		System.out.println(ts.lower(115));
//		System.out.println(ts);

		// Hash set
//		HashSet hs = new HashSet();
//		hs.add(10);
//		hs.add(20);
//		hs.add(90);
//		hs.add(40);
//		hs.add(79);
//		hs.add(35);
//		hs.add(100);
//		System.out.println(hs);
		
		//Linked hash set

//		LinkedHashSet lhs =new LinkedHashSet();
//		lhs.add(10);
//		lhs.add(20);
//		lhs.add(90);
//		lhs.add(40);
//		lhs.add(79);
//		lhs.add(35);
//		lhs.add(100);
//		System.out.println(lhs);
		
		
		
	}

}
