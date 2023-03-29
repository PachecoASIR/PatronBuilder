public class BuilderPizzas {

    protected Pizzas _pizza;

    public Pizzas build() {
        return this._pizza;
    }
    public BuilderPizzas (){
        _pizza = new Pizzas(null, false, 0, false, null, false, false, false, false, false, false);
    }

    public BuilderPizzas setTipoMasa (String TipoMasa){
        _pizza.setTipoMasa(TipoMasa);
        return this;
    }
    public BuilderPizzas setTipo (int Tipo){
        _pizza.setTipo(Tipo);
        return this;
    }
    public BuilderPizzas setSalsa (boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }
    public BuilderPizzas setTipoSalsa (String TipoSalsa){
        _pizza.setTipoSalsa(TipoSalsa);
        return this;
    }
    public BuilderPizzas setCebolla (boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }
    public BuilderPizzas setGluten (boolean gluten){
        _pizza.setGluten(gluten);
        return this;
    }
    public BuilderPizzas setQueso (boolean queso){
        _pizza.setQueso(queso);
        return this;
    }
    public BuilderPizzas setPina (boolean pina){
        _pizza.setPina(pina);
        return this;
    }
    public BuilderPizzas setChampis (boolean champis){
        _pizza.setChampinones(champis);
        return this;
    }
    public BuilderPizzas setJamon (boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }
}