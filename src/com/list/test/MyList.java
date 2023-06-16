package com.list.test;

import java.util.Arrays;

public class MyList {

	private static final int INITIAL_SIZE = 10;
	private Object[] elements;
	private int size;

	public MyList() {
		elements = new Object[INITIAL_SIZE];
		size = 0;
	}

	public void add(Object element) {
		elements[size++] = element;
	}

	public Object get(int currentIndex) {
		return elements[currentIndex];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void remove(int i) {
		System.arraycopy(elements, i + 1, elements, i, 1);
		elements[--size] = null;
	}

	public Object contains(Object searchElement) {
		return Arrays.asList(elements)
		.stream()
		.filter(eachElement -> eachElement.equals(searchElement))
		.findAny()
		.isPresent();
	}
}
