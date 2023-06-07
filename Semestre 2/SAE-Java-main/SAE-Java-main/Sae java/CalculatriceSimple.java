public class CalculatriceSimple{
    public static void main (String[] args){
Nombre testge = new Nombre(2);
Nombre test = new Nombre(3);
Nombre tests = new Nombre(17);
Expression deux = new Nombre(testge);
Expression trois = new Nombre(test) ;
Expression dixSept = new Nombre(tests) ;
Expression s = new Soustraction(dixSept, deux) ;
Expression a = new Addition(deux, trois) ;
Expression d = new Division(s, a) ;
System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3 
    
    
    
    
    }}
