public class Cat extends Pet {
    public Cat(String name, int yars, String color) {
        super(name, yars, color);
    }

    @Override
    public void getVoic() {
        System.out.println("hallo i am cat");
    }
}
