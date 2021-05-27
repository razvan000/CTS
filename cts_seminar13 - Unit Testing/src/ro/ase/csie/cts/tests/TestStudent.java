package ro.ase.csie.cts.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.exceptions.WrongAgeException;
import ro.ase.csie.cts.exceptions.WrongGradeExceptions;
import ro.ase.csie.cts.exceptions.WrongNameException;
import ro.ase.csie.cts.models.Student;

public class TestStudent {
	
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName = "John";
	static int initialAge = 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		grades = new ArrayList<>();
		grades.add(9);
		grades.add(10);
		grades.add(8);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		grades.clear();
		grades=null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(initialName,initialAge,grades);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameConformanceForRightInput() throws WrongNameException {
		String newName = "Dove";
		student.setName(newName);
		assertEquals( "Testing with a proper name", newName, student.getName());
	}
	
	@Test
	public void testSetAgeConformanceForRightInput() {
		int newAge = initialAge + 1;
		try {
			student.setAge(newAge);
			assertEquals("Testing with right values",newAge,student.getAge());
		} catch (WrongAgeException e) {
			fail("We got an exception for right data");
		}
	}

	@Test
	public void testSetAgeErrorConditionNegativeValue() {
		int newAge = initialAge* -1;
		try {
			student.setAge(newAge);
			fail("Didn t get exception");
		} catch (WrongAgeException e) {
			assertTrue(true);
		}
	}
	
	@Test(expected = WrongNameException.class)
	public void testSetNameErrorConditionSmallName() throws WrongNameException {
		String newName = "Io";
		student.setName(newName);
	}
	
	@Test
	public void testGetGradesAverage() throws WrongGradeExceptions {
		ArrayList<Integer> sortedGrades = new ArrayList<>();
		for (int i=5; i<10;i++) {
			sortedGrades.add(i);
		}
		student.setGrades(sortedGrades);
		float expectedAverage = 7;
		float computedAverage = student.getGradesAverage();
		assertEquals("Testing with sorted array of grades",expectedAverage,computedAverage, 0);
		
	}
	
	@Test
	public void testGetGradesCardinalityZero() throws WrongGradeExceptions {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		float expectedAvg = 0;
		float computedAvg = student.getGradesAverage();
		
		assertEquals("Testing an empty arr of grades",expectedAvg,computedAvg, 0);
	}
	
	@Test
	public void testGetGradesCardinalityOne() throws WrongGradeExceptions {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(Student.MAX_GRADE);
		student.setGrades(grades);
		
		float expectedAvg = Student.MAX_GRADE;
		float computedAvg = student.getGradesAverage();
		
		assertEquals("Testing an arr with one element of grades",expectedAvg,computedAvg, 0);
	}
	
	@Test
	public void testGetGradesAverageExistenceNullReferenceForGrades() throws WrongGradeExceptions {
		student.setGrades(null);
		
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with null for grades",expectedAverage,computedAverage, 0);

	}
}























