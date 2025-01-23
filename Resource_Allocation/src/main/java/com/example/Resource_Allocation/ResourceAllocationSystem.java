package com.example.Resource_Allocation;

import java.util.*;
import java.util.stream.Collectors;

/*public class ResourceAllocationSystem {
  /*  private static List<Resource> resourceList = ResourceDataStore.getSampleResources();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter required skills (comma-separated):");
        String skills = scanner.nextLine();
        System.out.println("Enter minimum years of experience:");
        int minExperience = scanner.nextInt();

        findResources(skills, minExperience);
        scanner.close();
    }

    public static void findResources(String requiredSkills, int minExperience) {
        Set<String> requiredSkillSet = new HashSet<>(Arrays.asList(requiredSkills.split(",\s*")));

        System.out.println("Matching Resources:");
        for (Resource resource : resourceList) {
            if (resource.getSkills().containsAll(requiredSkillSet) && resource.getExperience() <= minExperience) {
                System.out.println(resource);
            }
        }
      
    }*/
	
	/*private static List<Resource> resourceList = ResourceDataStore.getSampleResources();

    public static void main(String[] args) {
        listMicroServiceResources();
        listCloudBasedResources();
    }

    public static void listMicroServiceResources() {
        System.out.println("\n1. Resources for Microservice-based Project (Skills: Java, Redis, JavaScript)");
        List<Resource> result = resourceList.stream()
            .filter(resource -> resource.getSkills().containsAll(Set.of("Java", "Redis", "JavaScript")))
            .collect(Collectors.toList());
        printResourceNames(result);
    }

    public static void listCloudBasedResources() {
        System.out.println("\n2. Cloud-based Project (Skills: MySQL, Docker, Spring, React) with Experience < 10 years");
        List<Resource> result = resourceList.stream()
            .filter(resource -> resource.getSkills().containsAll(Set.of("MySQL", "Docker", "Spring", "React")))
            .filter(resource -> resource.getExperience() < 10)
            .collect(Collectors.toList());
        printResourceNames(result);
    }

    private static void printResourceNames(List<Resource> resources) {
        if (resources.isEmpty()) {
            System.out.println("No matching resources found.");
        } else {
        	String names = resources.stream().map(Resource::getResourceName).collect(Collectors.joining(", "));

            System.out.println(names);
        }
}
}*/
public class ResourceAllocationSystem {
    private static List<Resource> resourceList = ResourceDataStore.getSampleResources();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input for microservice project
        System.out.println("Enter skills for Microservice-based Project (comma-separated):");
        String microserviceSkills = scanner.nextLine();
        listResourcesBySkills(microserviceSkills, Integer.MAX_VALUE);

        // User input for cloud-based project
        System.out.println("Enter skills for Cloud-based Project (comma-separated):");
        String cloudSkills = scanner.nextLine();
        System.out.println("Enter maximum experience for Cloud-based Project:");
        int maxExperience = scanner.nextInt();
        listResourcesBySkillsAndExperience(cloudSkills, maxExperience);

        scanner.close();
    }

    public static void listResourcesBySkills(String skillInput, int maxExperience) {
        Set<String> requiredSkills = new HashSet<>(Arrays.asList(skillInput.split(",\\s*")));
        List<Resource> result = resourceList.stream()
            .filter(resource -> resource.getSkills().containsAll(requiredSkills))
            .filter(resource -> resource.getExperience() < maxExperience)
            .collect(Collectors.toList());
        printResourceNames(result);
    }

    public static void listResourcesBySkillsAndExperience(String skillInput, int maxExperience) {
        Set<String> requiredSkills = new HashSet<>(Arrays.asList(skillInput.split(",\\s*")));
        List<Resource> result = resourceList.stream()
            .filter(resource -> resource.getSkills().containsAll(requiredSkills))
            .filter(resource -> resource.getExperience() < maxExperience)
            .collect(Collectors.toList());
        printResourceNames(result);
    }

    private static void printResourceNames(List<Resource> resources) {
        if (resources.isEmpty()) {
            System.out.println("No matching resources found.");
        } else {
            String names = resources.stream().map(Resource::getResourceName).collect(Collectors.joining(", "));
            System.out.println(names);
        }
    }
}

