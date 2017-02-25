
package vista;

public class Util {
    public static boolean esOperador(char a){
        return a=='+'||a=='-'||a=='*'||a=='/';
    }
    
    public static String eliminarEspacios(String cadena){
        String operacion="";
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                i++;
            }
            operacion=operacion+cadena.length();
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
}
