public class Pet {
    public String name;
    public int yars;
    public String color;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", yars=" + yars +
                ", color='" + color + '\'' +
                '}';
    }

    public void getVoic() {
        String voic = "Hallo i am animal";
        System.out.println(voic);
    }

    public Pet (String name,int yars,String color) {
        this.name = name;
        this.yars = yars;
        this.color = color;
    }
}
