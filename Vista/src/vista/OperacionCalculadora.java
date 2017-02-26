
package vista;

import PilaA.PilaA;
import java.util.ArrayList;

/**
 *
 * @author manchaswim
 */
public abstract class OperacionCalculadora {
    
    public static boolean revisaParentesis(String cadena){
        PilaA <Character> p= new PilaA();
        int i,n;
        Character x;
        boolean bandera=true;
        i=0;
        n=cadena.length();
        
        while(i<n && bandera){
            if(cadena.charAt(i)=='('){
                p.push(cadena.charAt(i));
            }
            else if(cadena.charAt(i)==')'){
                x=p.pop(); 
                if(x==null){ 
                    bandera=false;
                }
            } 
            i++;
        }
        return p.isEmpty() && bandera;
    }
    
    
    public static boolean operadoresRepetidos(String cad){
        boolean resp=false;
        int i,n;
        String cadena=Util.eliminarEspacios(cad);
        System.out.println(cadena);
        n=cadena.length();
        i=0;
        while(i<n-1 && !resp){
            if(Util.esOperador(cadena.charAt(i)) && Util.esOperador(cadena.charAt(i+1))){
                resp=true;
            }
            else
                i++;
        }
        return resp;
    }
    
   
    public static ArrayList convertirAPostFijo(char [] inFija){
        int i = 0;
        ArrayList postFija = new ArrayList();
        PilaA operadores = new PilaA();        
        while(i<inFija.length){
            System.out.println(i);
            if(inFija[i]=='('){
                operadores.push(inFija[i]);
            }           
            else if((inFija[i]=='*')||(inFija[i]=='/')||(inFija[i]=='+')||(inFija[i]=='-')){
                while(!operadores.isEmpty()&&(Util.getPrioridad(inFija[i])<=Util.getPrioridad((char)operadores.peek()))&&((char)operadores.peek()!='(')){   
                    postFija.add(operadores.pop());
                }
                operadores.push(inFija[i]);
            }
            else if(inFija[i]==')'){
                while((char)operadores.peek()!='('){
                    postFija.add(operadores.pop());
                }
                operadores.pop();
            }
            else if(inFija[i]==' '){
                postFija.add(inFija[i]);
                i++;
                while(i<inFija.length&&inFija[i]!=' '){
                    postFija.add(inFija[i]);
                    i++;
                }
                postFija.add(' ');
            }
            i++;
        }
       
        
        while(!operadores.isEmpty()){
            postFija.add(operadores.pop());
        }
       
        return postFija;
    }
    
    public static String evaluarPostFija(ArrayList postFija){
        String numero="";
        double respuesta=0,div1, div2;
        boolean operacion=false;
        PilaA operandos = new PilaA();
        try{
           for(int i=0;i<postFija.size();i++){
               if(Util.esOperador((char)postFija.get(i))){
                   operacion = true;
                   switch((char)postFija.get(i)){
                        case '+':
                            respuesta = (double)operandos.pop()+(double)operandos.pop();
                            operandos.push(respuesta);
                           break;
                        case '*':
                            respuesta = (double)operandos.pop()*(double)operandos.pop();
                            operandos.push(respuesta);
                            break;
                        case '/':
                            div2 = (double)operandos.pop();
                            div1 = (double)operandos.pop();
                                respuesta = div1/div2;
                                operandos.push(respuesta);
                            if(div2==0){
                                return "dividing by zero!";
                            }
                            break;
                   }
               }
               else if((char)postFija.get(i)==' '){
                   i++;
                   while((char)postFija.get(i)!=' '){
                       numero=numero+(char)postFija.get(i);
                       i++;
                   }
                   if(!operacion){
                        respuesta=Double.parseDouble(numero);
                   } 
                   operandos.push(Double.parseDouble(numero));
                   numero="";
               }
           } 
        }
        catch(Exception e){
            return "Syntax error"; 
        }    
        return Double.toString(respuesta);
    } 
}
