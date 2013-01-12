package firstTest_Test;

import static org.junit.Assert.*;
import hudson.model.FreeStyleBuild;
import hudson.model.FreeStyleProject;
import hudson.tasks.Shell;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.jvnet.hudson.test.HudsonTestCase;
import static firstTest.FirstJUnitTest.*;

public class FirstJUnitTest extends HudsonTestCase{
	
	public void test1() throws Exception {
        FreeStyleProject project = createFreeStyleProject();
        project.getBuildersList().add(new Shell("echo hello"));

        FreeStyleBuild build = project.scheduleBuild2(0).get();
        System.out.println(build.getDisplayName()+" completed");

        String s = FileUtils.readFileToString(build.getLogFile());
        assertTrue(s.contains("+ echo hello"));
    }

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
		//assertEquals(6, return5());
	}
	
	@Test
	/**
	 * red
	 */
	public void returnFertig_Fail(){
		//assertEquals("Erster", returnFertig());
	}
	
	@Test
	/**
	 * green
	 */
	public void returnFertig_Succ(){
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
