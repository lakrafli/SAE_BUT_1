public class Nombre extends Expression{
    private int vNombre;
    public Nombre(int x){
      this.vNombre = x;
    }
    public Nombre(Nombre x){
      this.vNombre = x.valeur();
    }
    public int valeur(){
      return this.vNombre;
    }

    public String toString(){
      return "Nombre : " + this.vNombre;
    }
}
