package com.rishabh.portfolioapi.service;

import com.rishabh.portfolioapi.model.Project;
import com.rishabh.portfolioapi.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // GET ALL
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // GET BY ID
    public Project getProjectById(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.orElseThrow(() -> new RuntimeException("Project not found with id: " + id));
    }

    // CREATE
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    // UPDATE
    public Project updateProject(Long id, Project updatedProject) {
        Project existingProject = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found with id: " + id));

        existingProject.setTitle(updatedProject.getTitle());
        existingProject.setDescription(updatedProject.getDescription());
        existingProject.setTechnologies(updatedProject.getTechnologies());
        existingProject.setGithubLink(updatedProject.getGithubLink());
        existingProject.setLiveDemoLink(updatedProject.getLiveDemoLink());

        return projectRepository.save(existingProject);
    }

    // DELETE
    public void deleteProject(Long id) {
        if (!projectRepository.existsById(id)) {
            throw new RuntimeException("Project not found with id: " + id);
        }
        projectRepository.deleteById(id);
    }
}