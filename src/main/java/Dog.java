public class Dog extends Pet {

    public Dog(String name, int yars, String color) {
        super(name, yars, color);
    }

    @Override
    public void getVoic() {
        System.out.println("Hallo i am Dog");
    }
}
