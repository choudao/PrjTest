package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListPic {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 5組UDD 1組時間要排序，依排序結果，放入LABEL裡，
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		List<Integer> d = new ArrayList<Integer>();
		List<Integer> e = new ArrayList<Integer>();
		for (int i = 0; i <= 5; i++) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			int num3 = (int) (Math.random() * 10);
			int num4 = (int) (Math.random() * 10);
			int num5 = (int) (Math.random() * 10);
			a.add(num1); // c.putData(UDD, i);
			b.add(num2);
			c.add(num3);
			d.add(num4);
			e.add(num5);
		}

		List<Integer> s = new ArrayList<Integer>();
		s.add(a.get(0));
		s.add(b.get(0));
		s.add(c.get(0));
		s.add(d.get(0));
		s.add(e.get(0));
		Comparator<Integer> comp = Collections.reverseOrder();
		Collections.sort(s, comp);
		System.out.println(s);
		
		
		Map<Integer, String> all = new TreeMap<Integer, String>();
		
		all.put(a.get(0),"a");
		all.put( b.get(0),"b");
		all.put(c.get(0),"c");
		all.put(d.get(0),"d");
		all.put(e.get(0),"e");
	    List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
	    Comparator<Map<Integer, String>> comp1 = Collections.reverseOrder();
	    Collections.sort(list,comp1);
	    System.out.println("Collections" + all);
	    
	    
		Iterator it = all.keySet().iterator();
		while(it.hasNext()){
			System.out.println("it " + it.next());
		}
		System.out.println("a" + a);	
		System.out.println("b" + b);
		System.out.println("c" + c);
		System.out.println("d" + d);
		System.out.println("e" + e);

		
		

		
		
		
		
		
	}
}