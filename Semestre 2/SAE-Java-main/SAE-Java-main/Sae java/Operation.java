public abstract class Operation extends Expression{
    private Expression vNombre1;
    private Expression vNombre2;
    public Operation(Expression x, Expression y){
      this.vNombre1 = x;
      this.vNombre2 = y;
    }
   
    public Expression getOperande1(){
      return this.vNombre1;
    }
    public Expression getOperande2(){
      return this.vNombre2;
    }
  
  }
