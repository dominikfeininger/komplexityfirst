package firstTest_Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static firstTest.FirstJUnitTest.*;

public class FirstJUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	/**
	 * red
	 */
	public void return5Test_Fail() {
		assertEquals(6, return5());
	}
	
	@Test
	public void returnFertig_Fail(){
		assertEquals("Fertig", returnFertig());
	}
	
	@Test
	/**
	 * green
	 */
	public void return5Test_Succ() {
		assertEquals(5, return5());
	}

}
