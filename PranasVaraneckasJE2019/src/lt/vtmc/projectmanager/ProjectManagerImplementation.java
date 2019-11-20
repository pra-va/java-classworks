package lt.vtmc.projectmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;

import lt.itakademija.exam.Issue;
import lt.itakademija.exam.Project;
import lt.itakademija.exam.ProjectManager;

/**
 * My exam implementation of project manager. Class implements ProjectManager
 * interface provided in exam task.
 * 
 * @author Pranas Varaneckas
 *
 */

public class ProjectManagerImplementation implements ProjectManager {
	/**
	 * log4j is used to log to a file. Stamps ArrayList is created to store the
	 * collection of post stamps.
	 * 
	 */
	private static final Logger LOGGER = Logger.getLogger(ProjectManagerImplementation.class);
	private List<Project> projects = new ArrayList<Project>();

	/**
	 * Will create new issue and add it to a project, provided in parameters, if
	 * projects list contains such element.
	 * 
	 * @param project for new issue to be created in.
	 * @param summary of the project
	 * @return new issue.
	 * @throws NullPointerException     if provided parameters contains null values.
	 * @throws IllegalArgumentException if provided parameter summary contains empty
	 *                                  value.
	 */
	@Override
	public Issue createIssue(Project project, String summary) {
		if (project == null || summary == null) {
			LOGGER.error(
					"NullPointerException in createIssue(Project project, String summary) : either project, summary or both of them are null.");
			throw new NullPointerException();
		} else if (summary.equals("")) {
			LOGGER.error(
					"IllegalArgumentException in createIssue(Project project, String summary): summary field is empty String.");
			throw new IllegalArgumentException();
		}

		Issue issue = new Issue(project, summary);

		for (Project projectIterator : this.projects) {
			if (projectIterator.equals(project)) {
				projectIterator.addIssue(issue);
				LOGGER.info("New issue created for project with id " + projectIterator.getId() + ".");
			}
		}

		return issue;
	}

	/**
	 * Creates issue in the project of which id is provided in parameters.
	 * 
	 * @param projectId will contain id of the project for which new issue should be
	 *                  created.
	 * @param summary.
	 * @return issue created for the project with the id provided in parameters.
	 * @throws NullPointerException     if provided parameters contains null values.
	 * @throws IllegalArgumentException if provided parameters contains empty
	 *                                  values.
	 */
	@Override
	public Issue createIssue(String projectId, String summary) {
		if (projectId == null || summary == null) {
			LOGGER.error(
					"NullPointerException in createIssue(String projectId, String summary): either project, summary or both of them are null.");
			throw new NullPointerException();
		} else if (projectId.equals("") || summary.equals("")) {
			LOGGER.error(
					"IllegalArgumentException in createIssue(String projectId, String summary): either project id, summary or both field are empty String.");
			throw new IllegalArgumentException();
		}

		for (Project projectIterator : this.projects) {
			if (projectIterator.getId().contentEquals(projectId)) {
				Issue issue = new Issue(projectIterator, summary);
				projectIterator.addIssue(issue);
				LOGGER.info("New issue created for project with id " + projectIterator.getId() + ".");
				return issue;
			}
		}
		return null;
	}

	/**
	 * Will create new project and add it to a projects list.
	 * 
	 * @param id      of the project
	 * @param summary of the project
	 * @throws NullPointerException     if provided parameters contains null values.
	 * @throws IllegalArgumentException if provided parameters contains empty
	 *                                  values.
	 * @return newly created project.
	 */
	@Override
	public Project createProject(String id, String summary) {
		if (id == null || summary == null) {
			LOGGER.error(
					"NullPointerException in createProject(String id, String summary) : either id, summary or both of them are null.");
			throw new NullPointerException();
		} else if (id.equals("") || summary.equals("")) {
			LOGGER.error(
					"IllegalArgumentException in createProject(String id, String summary) : either id, summary or both of them are empty strings.");
			throw new IllegalArgumentException();
		}

		Project project = new Project(id, summary);
		this.projects.add(project);
		LOGGER.info("New project is created with: id: " + id + "; summary: " + summary + ".");
		return project;
	}

	/**
	 * Finds issues of specific project.
	 * 
	 * @param project of which issues should be found.
	 * @return issues collection that belongs to a provided project.
	 */
	@Override
	public Collection<Issue> getIssues(Project project) {
		return project.getIssues();
	}

	/**
	 * Will look for specific project id in projects list to return issues of this
	 * project.
	 * 
	 * @param projectId of which issues should be found.
	 * @return issues of specific project that parameter id targets for.
	 */
	@Override
	public Collection<Issue> getIssues(String projectId) {
		for (Project projectIterator : projects) {
			if (projectIterator.getId().equals(projectId)) {
				return projectIterator.getIssues();
			}
		}
		return null;
	}

	/**
	 * Find specific project by its id provided as a parameter.
	 * 
	 * @param id of the project to be returned.
	 * @return project of which id is provided as a parameter.
	 */
	@Override
	public Project getProjectById(String id) {
		for (Project project : this.projects) {
			if (project.getId().equals(id)) {
				return project;
			}
		}
		return null;
	}

	/**
	 * @return a list of projects as a collection.
	 */
	@Override
	public Collection<Project> getProjects() {
		return this.projects;
	}

	public int getProjectsNumber() {
		return this.projects.size();
	}

}
