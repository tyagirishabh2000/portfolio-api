package com.rishabh.portfolioapi.repository;

import com.rishabh.portfolioapi.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}