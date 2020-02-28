package com.springbootmaven.Try2.controller;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Integer> {

    // custom query to search to blog post by title or content
    List<Project> getId(int id);

}