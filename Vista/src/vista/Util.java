
package vista;

import java.util.ArrayList;

public abstract class Util {
    public static boolean esOperador(char a){
        return a=='+'||a=='-'||a=='*'||a=='/';
    }
    
    public static String eliminarEspacios(String cadena){
        String operacion="";
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                i++;
            }
            operacion=operacion+cadena.charAt(i);
        }
        return operacion;
    }
    
     public static int getPrioridad(char operador){
        int jerarquia;
        switch(operador){
            case '*':
                jerarquia=1;
                break;
            case '/':
                jerarquia=1;
                break;
            case '+':
                jerarquia=0;
                break;
            case '-':
                jerarquia=0;
                break;
            default:
                jerarquia=0;
                break;
        }
        return jerarquia;
    }
     
    public static String addInversoAditivo(String cadena){
        
        StringBuilder expresion = new StringBuilder();
        ArrayList inFijaIA = new ArrayList();
        for(int i=0; i<cadena.length();i++){
            if(cadena.charAt(i)=='-'){
                expresion.append("+( -1 )*");
            }
            else{
                expresion.append(cadena.charAt(i));
            }
        }
        return expresion.toString();
    }
    
    public static String quitaSignosMas(String cad){
        int n,i;
        char x;
        String cadCorregida;
        cadCorregida="";
        n=cad.length();
        i=0;
        
        while(i<n){
            x=cad.charAt(i);
            //si no es un signo de suma
            if(x!= '+' )
                cadCorregida+=x;
            //si es un simbolo de sum
            else
                //en caso de que la expresion empiece con un simbolo de suma
                if(i!=0)
                    if(cad.charAt(i-1)!='(' && cad.charAt(i-1)!='*' && cad.charAt(i-1)!='/')
                        cadCorregida+=x;
            
            i++;      
        }
        return cadCorregida;
    }
}
