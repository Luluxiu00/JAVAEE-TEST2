package com.example.conditional;


public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}