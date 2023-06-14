package com.list.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyListTest {

	private List<String> myTestList;
	
	@Before
	public void setUp() {
		myTestList = new MyList();
	}
	
	@Test
	public void testAdd() {
		myTestList.add("Sreehari");
		assertEquals(1, myTestList.size());
	}

}
