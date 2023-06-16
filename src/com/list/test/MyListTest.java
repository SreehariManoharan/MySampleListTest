package com.list.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyListTest {

	private MyList myTestList;
	
	@Before
	public void setInitialList() {
		myTestList = new MyList();
	}
	
	@Test
	public void testAdd() {
		myTestList.add("Sreehari");
		assertEquals("Sreehari", myTestList.get(0));
	}
	
	@Test
	public void testSize() {
		myTestList.add("GOD");
		assertEquals(1, myTestList.size());
	}
	
	@Test
	public void testIsEmpty() {
		assertEquals(true, myTestList.isEmpty());
		myTestList.add("Some random test Data");
		assertEquals(false, myTestList.isEmpty());
	}

	@Test
	public void testRemove() {
		myTestList.add("GOD.dev");
		myTestList.add("Sreehari");
		assertEquals("GOD.dev", myTestList.get(0));
		myTestList.remove(0);
		assertEquals("Sreehari", myTestList.get(0));
	}
}
