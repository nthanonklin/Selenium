package com.testng.parallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/*
 * Advantages of parallel rests execution
 * 1.Reduces execution time 
 * 2.Allows multi-threaded tests
 * This feature helps QA to configure their tests to be executed easily in multiple browsers 
 * or operating systems simultaneously.
 */

/*
 * Run parallel testng testcases
 * example of how to run methods in parallel using testng xml from single class file.
 */


public class ParallelMethodTest {
	
	@BeforeMethod
	public void beforeMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("Before test method. Thread id is " + id);
	}
	
	@Test
	public void testMethodOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method One. Thread id is " + id);
	}
	
	@Test
	public void testMethodTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Two. Thread id is " + id);
	}
	
	@AfterMethod
	public void afterMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("After test-method. Thread id is " + id);
	}
	
}
