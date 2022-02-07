public class Cat extends Pet {

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", yars=" + yars +
                ", color='" + color + '\'' +
                ", voic='" + voic + '\'' +
                '}';
    }

    public Cat(String name,int yars,String color,String voic) {
        this.name = name;
        this.yars = yars;
        this.color = color;
        this.voic = voic;
    }
}
