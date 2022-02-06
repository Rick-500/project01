public class lesson01 {
    public static void main(String [] args){
        Emplayee one = new Emplayee("Гадя","Хреново","Петрович",9.4f,54.7f);
        Emplayee two = new Emplayee("Вася","Пупкин","Владимирович",11.0f,0.1f);
        Emplayee three = new Emplayee("Вулф","Пукин","Абоба",122.6f,51.5f);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println();
        Emplayee[] players = new Emplayee[]{one,two,three};

        Department pizzas = new Department("Мисители Теста","1998г",players);
        System.out.println(pizzas);
    }
}
