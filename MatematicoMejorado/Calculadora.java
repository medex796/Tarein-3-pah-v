

public class Calculadora
{
   public String variables(double a, double b, double c){
     double res1;
     double res2;
     double resultado;
    
     String report;
     res1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
         res2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
     resultado=res1;
     report=" x1= " + res1 + " ; " + " x2= " + res2;
     return  report;
     
    }
   private Punto punto;
   public double recta(double x1, double x2,  double y1, double y2){
     double y;
     double m;
     double b;
     punto=new Punto();
     m=punto.pendiente(x1, x2, y1, y2);
     b=-m*x1 + y1;
     y=m*x1+b;
     return y;
     
     //esta ecuacion retorna y ;v xd usando los puntos x1 && y1 ;v
    } 
    public double Cateto(double hip, double cat){
        hip=hip;
        cat=cat;
        double catFaltante;
        catFaltante = Math.sqrt((hip*hip)-(cat*cat));
        return catFaltante;
        //ojo q la hipotenusa siempre tiene q ser mayor a los catetos pah ;v
    }
}
