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

}
