package ro.ase.csie.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.tests.category.PerformanceTest;

@RunWith(Categories.class)
@IncludeCategory({PerformanceTest.class})
@SuiteClasses({ TestStudent.class, TestStudentNewTests.class })
public class AllPerformanceTests {

}
