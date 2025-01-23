package com.example.Resource_Allocation;

import java.util.*;

public class Resource {
    private int resourceId;
    private String resourceName;
    private Set<String> skills;
    private int experience;

    public Resource(int resourceId, String resourceName, String skillList, int experience) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.skills = new HashSet<>(Arrays.asList(skillList.split(",\s*")));
        this.experience = experience;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Resource ID: " + resourceId + ", Name: " + resourceName + ", Skills: " + skills + ", Experience: " + experience + " years";
    }
}