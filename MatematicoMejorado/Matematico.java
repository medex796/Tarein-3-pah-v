
public class Matematico
{
    private Calculadora calculador;
    
    public double triangulo(double hip, double cat){
        double resultado;
        calculador=new Calculadora();
        resultado=calculador.Cateto(hip, cat);
        return resultado;
    }
    public String ecuacion(double a, double b, double c){
        
        String res;
        
        calculador= new Calculadora();
        res=calculador.variables(a, b, c) ;
        
        return res;
    }
    public double ecuaRecta(double x1, double x2, double y1, double y2){
        double resultad;
        calculador=new Calculadora();
        resultad=calculador.recta(x1, x2, y1, y2);
        return resultad;
    }
}
