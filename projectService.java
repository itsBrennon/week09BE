package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;


public class projectService {
	private ProjectDao projectDao = new ProjectDao();
	/**
	 * @param project The{@link Project} object.
	 * @return The Project object with the newly generated primary key value.
	 */
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
}