package lt.vtmc.projectmanager;

import lt.itakademija.exam.ProjectManager;
import lt.itakademija.exam.test.BaseTest;

/**
 * Java Exam Solution for project manager implementation.
 * 
 * @author Pranas Varaneckas
 *
 */
public class MyProjectManager extends BaseTest {

	/**
	 * @return my implementation of ProjectManager interface.
	 */
	@Override
	protected ProjectManager createProjectTracker() {
		return new ProjectManagerImplementation();
	}

}
