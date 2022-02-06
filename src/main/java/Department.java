import java.util.Arrays;

public class Department {
    private String name;
    private String createDate;
    private Emplayee[] emplayees;

    public Department(String name, String createDate, Emplayee[] emplayees) {
        this.name = name;
        this.createDate = createDate;
        this.emplayees = emplayees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", createDate='" + createDate + '\'' +
                ", emplayees=" + Arrays.toString(emplayees) +
                '}';
    }
}
