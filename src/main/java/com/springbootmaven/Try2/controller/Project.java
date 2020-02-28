package com.springbootmaven.Try2.controller;

import javax.persistence.*;

@Entity
//@Table
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fullName;
//    private String description;
//    private int creatorId;
//    private User[] activeUsers;

    public Project(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
//        this.description = description;
//        this.creatorId = creatorId;
//        this.activeUsers = activeUsers;
    }

//    public Project(int id, String fullName, String description, int creatorId, User[] activeUsers) {
//        this.id = id;
//        this.fullName = fullName;
//        this.description = description;
//        this.creatorId = creatorId;
//        this.activeUsers = activeUsers;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getCreatorId() {
//        return creatorId;
//    }
//
//    public void setCreatorId(int creatorId) {
//        this.creatorId = creatorId;
//    }
//
//    public User[] getActiveUsers() {
//        return activeUsers;
//    }
//
//    public void setActiveUsers(User[] activeUsers) {
//        this.activeUsers = activeUsers;
//    }


}
