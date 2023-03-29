public class Main {
    public static void main(String[] args) {
        Pizzas builder = new BuilderPizzas().build();
        Pizzas eleccion = new BuilderPizzas()
                .setTipo(Pizzas.familiar)
                .setCebolla(false)
                .setPina(true)
                .setChampis(true)
                .setJamon(true)
                .build();

        System.out.println(builder.toString());
        System.out.println(eleccion.toString());
    }
}