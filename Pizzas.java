public class Pizzas {
    
    public String masa;
    public boolean relleno;
    public int tipo;
    public boolean salsa;
    public String tipoSalsa;
    public boolean cebolla;
    public boolean sinGluten;
    public boolean extQueso;
    public boolean pina;
    public boolean champinones;
    public boolean jamon;

  public static final String normal = "normal";
  public static final String integral = "integral";
  public static final String fina = "fina";
  public static final String gruesa = "masa pan";
  public static final boolean sinRelleno = false;
  public static final boolean conRelleno = true;

  public static final int familiar = 1;
  public static final int mediana = 2;
  public static final int pequena = 3;

  public static final boolean conSalsa = true;
  public static final boolean sinSalsa = false;

  public static final String barbacoa = "salsa barbacoa";
  public static final String tomate = "salsa de tomate";

  public static final boolean sinCebolla = false;
  public static final boolean conCebolla = true;

  public static final boolean Gluten = false;

  public static final boolean extraQueso = true;

  public static final boolean conPina = true;
  public static final boolean sinPina = false;

  public static final boolean conChampis = true;
  public static final boolean sinChampis = false;

  public static final boolean conJamon = true;
  public static final boolean sinJamon = false;

  public Pizzas(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean extQueso, boolean pina, boolean champinones, boolean jamon){
      this.masa = normal;
      this.relleno = sinRelleno;
      this.tipo = mediana;
      this.salsa = conSalsa;
      this.tipoSalsa = tomate;
      this.cebolla = conCebolla;
      this.sinGluten = true;
      this.extQueso = false;
      this.pina = conPina;
      this.champinones = sinChampis;
      this.jamon = conJamon;
  }

  public String getmasa() {
    return masa;
  }
  
  public void setTipoMasa(String masa) {
      this.masa = masa;
  }

  public boolean relleno() {
    return relleno;
  }

  public void setRelleno(boolean relleno) {
      this.relleno = relleno;
  }

  public int tipo(){
    return tipo;
  }

  public void setTipo(int tipo) {
      this.tipo = tipo;
  }

  public boolean salsa(){
    return salsa;
  }

  public void setSalsa(boolean salsa) {
      this.salsa = salsa;
  }

  public String TipoSalsa(){
    return tipoSalsa;
  }

  public void setTipoSalsa(String tipoSalsa) {
      this.tipoSalsa = tipoSalsa;
  }

  public boolean cebolla() {
    return cebolla;
  }

  public void setCebolla(boolean cebolla) {
      this.cebolla = cebolla;
  }

  public boolean sinGluten() {
    return sinGluten;
  }

  public void setGluten(boolean gluten) {
      sinGluten = gluten;
  }

  public boolean extQueso() {
    return extQueso;
  }

  public void setQueso(boolean queso) {
      extQueso = queso;
  }

  public boolean pina() {
    return pina;
  }

  public void setPina(boolean pina) {
      this.pina = pina;
  }

  public boolean champinones() {
    return champinones;
  }

  public void setChampinones(boolean champinones) {
      this.champinones = champinones;
  }

  public boolean jamon() {
    return jamon;
  }

  public void setJamon(boolean jamon) {
      this.jamon = jamon;
  }

  @Override
  public String toString(){
    return "----------------------------------------------------------------------------------" + "\nIngredientes Pizza: " + "\n----------------------------------------------------------------------------------" + "\nMasa: " + masa + "\nRelleno: " + relleno + "\nTipo: " + tipo + "\nSalsa: " + salsa + "\nTipoSalsa: " + tipoSalsa + "\nCebolla: " + cebolla + "\nSinGluten: " + sinGluten + "\nExtraQueso: " + extQueso + "\nPiña: " + pina + "\nChampiñones: " + champinones + "\nJamón: " + jamon;
  }
}