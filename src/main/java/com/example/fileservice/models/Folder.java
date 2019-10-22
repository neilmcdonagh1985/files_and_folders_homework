package com.example.fileservice.models;

import java.util.List;

public class Folder {

    private String title;
    private List<File> files;
    private User user;

    public Folder(String title, User user) {
        this.title = title;
        this.files = files;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
