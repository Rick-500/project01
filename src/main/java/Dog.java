public class Dog extends Pet {
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", yars=" + yars +
                ", color='" + color + '\'' +
                ", voic='" + voic + '\'' +
                '}';
    }

    public Dog(String name,int yars,String color,String voic) {
        this.name = name;
        this.yars = yars;
        this.color = color;
        this.voic = voic;
    }
}
