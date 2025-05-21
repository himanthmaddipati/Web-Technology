package org.example.osprojectnewjavafx;


import java.util.Comparator;

public class SortByArraivalTime implements Comparator<Object> {

	public int compare(Object o1, Object o2) {

		java.lang.Process p1 = (java.lang.Process) o1;
		java.lang.Process p2 = (java.lang.Process) o2;
		return Integer.compare(p1.arrivalTime, p2.arrivalTime);
	}
}