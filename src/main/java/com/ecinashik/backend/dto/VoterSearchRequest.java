package com.ecinashik.backend.dto;

public class VoterSearchRequest {
    private String fullName;
    private String village;
    private int age;
    private String gender;
    private String assemblyConstituency;

    // Getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAssemblyConstituency() {
        return assemblyConstituency;
    }

    public void setAssemblyConstituency(String assemblyConstituency) {
        this.assemblyConstituency = assemblyConstituency;
    }
}