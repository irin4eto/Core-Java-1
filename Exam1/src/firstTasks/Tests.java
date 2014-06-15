package firstTasks;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tests {
	
	private FirstTasks ft;

	@Before
	public void setUp() throws Exception {
		ft = new FirstTasks();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortedArray() {
		List<Integer> unSortedList = new ArrayList<>();
		unSortedList.add(5);
		unSortedList.add(2);
		unSortedList.add(8);
		
		assertFalse(unSortedList.equals(ft.sort(unSortedList)));
		
		Collections.sort(unSortedList);
		assertEquals(unSortedList, ft.sort(unSortedList));
	}
	
	@Test
	public void testReversedArray() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			array.add(i);
		}
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		for (int i = 4; i >= 0; i--) {
			reversed.add(i);
		}
		assertEquals(reversed, ft.reverse(array));
		List<Integer> reversedArray = (ArrayList<Integer>) ft.reverse(array);
		assertFalse(array.equals(reversedArray));
		
	}
	
	@Test
	public void testIsMonotonous() {
		assertEquals(true, ft.isMonotonous(Arrays.asList(1,2,3,4,5,6)));
		assertEquals(true, ft.isMonotonous(Arrays.asList(6,5,4,3,2,1,1,1)));
		assertEquals(false, ft.isMonotonous(Arrays.asList(1,2,1,4,5,4)));
		assertEquals(true, ft.isMonotonous(Arrays.asList(1,1,1)));
	}

}
