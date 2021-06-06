package ro.ase.csie.mateescu.razvan.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.mateescu.razvan.tests.category.InterestingTest;

@RunWith(Categories.class)
@IncludeCategory({InterestingTest.class})
@SuiteClasses({ TestProductRequirementOne.class,
	TestProductRequirementThree.class, 
	TestProductRequirementTwo.class,})
public class TestSuiteTwo {

}
