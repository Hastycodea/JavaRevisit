package Part8;

import java.util.HashMap;

public class ContainerInfo {

    private HashMap<String, Integer> containerVolume;
    private HashMap<String, String> containerNickName;
    
    public ContainerInfo() {
        this.containerVolume = new HashMap<>();
        this.containerNickName = new HashMap<>();
    }

    public void addLiquid(String name, int volume) {

        if(!containerVolume.containsKey(name) && volume > 0) {
            containerVolume.put(name, volume);

        } else if(containerVolume.containsKey(name) && volume > 0){
            int totalVolume = containerVolume.get(name) + volume;
            containerVolume.put(name, totalVolume);

        } else {
            System.out.println("Invalid volume input");
        }
    }

    public void averageVolume() {
        int total = containerVolume.values().stream().mapToInt(Integer::intValue).sum();
        double average = (double) total / containerVolume.size();
        System.out.println("The average is "+ average);
    }

    public void getContainerVolume(String name) {
        if(containerVolume.containsKey(name)) {
            System.out.println("The volume is " + containerVolume.get(name));
        } else {
            System.out.println("The container does not exist");
        }
    }

    public void addNickName(String name, String nickName) {
        if(containerVolume.containsKey(name)) {
            containerNickName.put(name, nickName);
            System.out.println("Added successfuly");
        } else {
            System.out.println("No such name");
        }
    }

    public void generateNickNames(String name) {
        if(containerNickName.containsKey(name)) {
            System.out.println("The nickname is " + containerNickName.get(name));
        } else {
            System.out.println("No nickname for that name");
        }
    }

    public void printAllContainers() {
        containerVolume.keySet().stream().forEach(s -> System.out.println(s + ": " + containerVolume.get(s)));
    }

    public void compareVolume(String name1, String name2) {
        int vol1 = 0, vol2 = 0;
        if (containerVolume.containsKey(name1) && containerVolume.containsKey(name2)) {
            vol1 = containerVolume.get(name1);
            vol2 = containerVolume.get(name2);
        }
        if (vol1 > vol2) {
            System.out.println(name1 + " > " + name2);
        } else if (vol1 < vol2) {
            System.out.println(name1 + " > " + name2);
        } else {
            System.out.println("Their volumes are equal");
        }
    }


    

}
