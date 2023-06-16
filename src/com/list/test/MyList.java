package com.list.test;


public class MyList{
	
	private static final int INITIAL_SIZE = 10;
    private Object[] elements;
    private int index;
    
    public MyList() {
        elements = new Object[INITIAL_SIZE];
        index = 0;
    }
	  public void add(Object element) {
	        elements[index++] = element;
	    }
	  public Object get(int currentIndex) {
		  return elements[currentIndex];
	  }
}
