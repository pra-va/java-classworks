package lt.vtmc.projectmanager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test class for projectManagerInplementation class.
 * 
 * @author Pranas Varaneckas
 *
 */
public class ProjectManagerImplementationTest {

	/**
	 * Checks if returns projects count correctly.
	 */
	@Test
	public void shouldReturnNumberOfProjectsCorrectly() {
		ProjectManagerImplementation projectManager = new ProjectManagerImplementation();
		projectManager.createProject("1", "Test object 1");
		projectManager.createProject("2", "Test object 2");
		projectManager.createProject("3", "Test object 3");
		assertEquals(3, projectManager.getProjectsNumber());
	}

	/**
	 * ProjectManagerImplementation should return number of issues in specific
	 * project correctly.
	 */
	@Test
	public void shouldReturnNumberOfIssuesInTheProjectCorrectly() {
		ProjectManagerImplementation projectManager = new ProjectManagerImplementation();
		projectManager.createProject("1", "Test project 1");
		projectManager.createIssue("1", "test issue 1");
		projectManager.createIssue("1", "test issue 2");
		projectManager.createIssue("1", "test issue 3");
		projectManager.createIssue("1", "test issue 4");
		assertEquals(4, projectManager.getIssues("1").size());
	}

}
