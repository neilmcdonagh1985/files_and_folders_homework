package com.example.fileservice.models;

public class File {

    private String name;
    private String extension;
    private int size;


    public File(String name, String extension, int size) {
        this.name = name;
        this.extension = extension;
        this.size = size;

    }
}
