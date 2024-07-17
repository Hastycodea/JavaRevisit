package Part5;

public class Person {
    private String name;
    private String id;
    private String gender;
    private String county;

    public Person(String name, String id, String gender, String county) {
        this.name = name; 
        this.id = id;
        this.gender = gender;
        this.county = county;
    }

    @Override
    public String toString() {
        return "Person{name='" +this.name+"',id='"+this.id+"',gender=" +this.gender+"',county='"+this.county+"'}";
    }
}
