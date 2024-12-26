package com.Collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSameAsCollection {

	private static final String Cellection = null;

	public static void main(String[] args) {

		// Map methods
		// Creates an empty HashMap object with default initial capacity 16 and default
		// fill
		// ratio "0.75".
		// 1.Object put(Object key,Object value);

		Map m = new HashMap<>(16);
		m.put(101, "chandra");
		m.put(102, "sekhar");
		m.put(103, "lingisetti");
		m.put(104, "tcs");
		m.put(104, "wipro");// replace value
		System.out.println(m);
		System.out.println(m.size());

		HashMap m1 = new HashMap();
		m1.put("chandra", 1);
		m1.put("sekhar", 2);
		m1.put("tcs", 3);
		m1.put(null, "chandra");
		m1.put("chandu", null);
		m1.put("chandu", "sekhar");
		System.out.println(m1);

		// 2.void putAll(Map m);
		m1.putAll(m);
		System.out.println(m1);

		// 3. Object get(Object key);
		System.out.println(m1.get("tcs"));

		// 4. Object remove(Object key);
		System.out.println(m1.remove(null));

		// 5.. boolean containsKey(Object key);
		System.out.println(m1.containsKey("chandu"));

		// 6.. boolean containsValue(Object value);
		System.out.println(m1.containsValue("sekhar"));

		// 7.boolean isEmpty();
		System.out.println(m1.isEmpty());

		// 8.Int size();
		System.out.println(m1.size());

		// 9. void clear();
		// m1.clear();
		System.out.println(m1);

		// 10. Set keySet(); The set of keys we are getting.
		Set s = m.keySet();
		System.out.println(s);

		// 11.. Collection values(); The set of values we are getting.
		Collection c = m1.values();
		System.out.println(c);
		Set s1 = m1.entrySet();
		System.out.println(s1);

		// 12. Set entrySet(); The set of entryset we are getting.
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m2 = (Map.Entry) itr.next();
			System.out.println(m2.getKey() + "   " + m2.getValue());
			if (m2.getKey().equals("chandu")) {
				m2.setValue("chandra");
			}

		}
		System.out.println(m1);

	}
}
