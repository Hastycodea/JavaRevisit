package Part8;

import java.util.HashMap;

public class ContainerInfo {

    private HashMap<String, Integer> containerVolume;
    private HashMap<String, String> containerNickName;

    public ContainerInfo() {
        this.containerVolume = new HashMap<>();
        this.containerNickName = new HashMap<>();
    }

    // Method to add a liquid container
    public void addLiquid(String name, int volume) {
        if (volume <= 0) {
            System.out.println("Invalid volume input");
            return;
        }
        
        containerVolume.put(name, containerVolume.getOrDefault(name, 0) + volume);
        System.out.println("Container '" + name + "' updated with volume: " + containerVolume.get(name));
    }

    // Method to calculate the average volume of all containers
    public void averageVolume() {
        if (containerVolume.isEmpty()) {
            System.out.println("No containers available to calculate the average volume.");
            return;
        }
        int total = containerVolume.values().stream().mapToInt(Integer::intValue).sum();
        double average = (double) total / containerVolume.size();
        System.out.println("The average is " + average);
    }

    // Method to get the volume of a specific container
    public void getContainerVolume(String name) {
        if (containerVolume.containsKey(name)) {
            System.out.println("The volume of '" + name + "' is " + containerVolume.get(name) + " liters.");
        } else {
            System.out.println("The container '" + name + "' does not exist.");
        }
    }

    // Method to add a nickname for a container
    public void addNickName(String name, String nickName) {
        if (containerVolume.containsKey(name)) {
            containerNickName.put(name, nickName);
            System.out.println("Nickname '" + nickName + "' added successfully for container '" + name + "'.");
        } else {
            System.out.println("No container found with the name '" + name + "'.");
        }
    }

    // Method to retrieve a nickname for a container
    public void generateNickNames(String name) {
        if (containerNickName.containsKey(name)) {
            System.out.println("The nickname for container '" + name + "' is: " + containerNickName.get(name));
        } else {
            System.out.println("No nickname found for container '" + name + "'.");
        }
    }

    // Method to print all containers and their volumes
    public void printAllContainers() {
        if (containerVolume.isEmpty()) {
            System.out.println("No containers available.");
            return;
        }
        System.out.println("Container Registry:");
        containerVolume.forEach((name, volume) -> System.out.println(name + ": " + volume + " liters"));
    }

    // Method to compare the volumes of two containers
    public void compareVolume(String name1, String name2) {
        if (containerVolume.containsKey(name1) && containerVolume.containsKey(name2)) {
            int vol1 = containerVolume.get(name1);
            int vol2 = containerVolume.get(name2);

            if (vol1 > vol2) {
                System.out.println(name1 + " has a larger volume than " + name2);
            } else if (vol1 < vol2) {
                System.out.println(name2 + " has a larger volume than " + name1);
            } else {
                System.out.println("Their volumes are equal.");
            }
        } else {
            System.out.println("One or both container names do not exist.");
        }
    }
}
