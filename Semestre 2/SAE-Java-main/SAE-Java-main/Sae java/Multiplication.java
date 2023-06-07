public class Multiplication  extends Operation{



  public Multiplication(Expression x, Expression y){
    super(x,y);
  }

  public int valeur(){

    return this.getOperande1().valeur() * this.getOperande2().valeur();

  }

  public String toString(){
      return this.getOperande1().valeur() + "*" + this.getOperande2().valeur();
  }



}
