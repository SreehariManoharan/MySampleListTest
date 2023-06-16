package com.list.test;


public class MyList{
	
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
}
