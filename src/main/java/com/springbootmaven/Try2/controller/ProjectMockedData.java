package com.springbootmaven.Try2.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProjectMockedData {





    private static ProjectMockedData instance = null;
    public static ProjectMockedData getInstance(){
        if(instance == null){
            instance = new ProjectMockedData();
        }
        return instance;
    }


    private List<Project> projects;

    public ProjectMockedData() {
        User[] users = {
                new User(2, "Denis", "Danilyuk"),
                new User(3, "Donis", "Danilyuk")
        };
        projects = new ArrayList<Project>();
        projects.add(new Project(2, "Deadline"));
//        projects.add(new Project(2, "Deadline", "123", 2, users));
    }

    public List<Project> fetchProjects() {
        return projects;
    }

    // return blog by id
    public Project getBlogById(int id) {
        for(Project b: projects) {
            if(b.getId() == id) {
                return b;
            }
        }
        return null;
    }

//    // search blog by text
//    public List<Project> searchProject(int id) {
//        List<Project> searchedProjects = new ArrayList<Project>();
//        for(Project b: projects) {
//            if(b.getId().contains(id) ||
//                    b.getContent().toLowerCase().contains(searchTerm.toLowerCase())) {
//                searchedBlogs.add(b);
//            }
//        }
//
//        return searchedBlogs;
//    }

    // create blog
    public Project createProject(int id, String fullName) {
        Project newProject = new Project(id, fullName);
        projects.add(newProject);
        return newProject;
    }

//    // update blog
//    public Project updateProjects(int id, String fullName, String description, int creatorId, User[] activeUsers) {
//        for(Project b: projects) {
//            if(b.getId() == id) {
//                int blogIndex = projects.indexOf(b);
//                b.setId(id);
//                b.setDescription(description);
//                b.setCreatorId(creatorId);
//                b.setFullName(fullName);
//                b.setActiveUsers(activeUsers);
//
//                projects.set(blogIndex, b);
//                return b;
//            }
//        }
//
//        return null;
//    }

//    // delete blog by id
//    public boolean delete(int id){
//        int blogIndex = -1;
//        for(Project b: projects) {
//            if(b.getId() == id) {
//                blogIndex = projects.indexOf(b);
//                continue;
//            }
//        }
//        if(blogIndex > -1){
//            projects.remove(blogIndex);
//        }
//        return true;
//    }
}
