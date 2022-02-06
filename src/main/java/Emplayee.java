public class Emplayee {
    private String name ;
    private String surename;
    private String fortname;
    private float age;
    private float salary;

    @Override
    public String toString() {
        return "Emplayee{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", fortname='" + fortname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';

    }

    public Emplayee(String name, String surename, String fortname, float age, float salary) {
        this.name = name;
        this.surename = surename;
        this.fortname = fortname;
        this.age = age;
        this.salary = salary;
    }
}
