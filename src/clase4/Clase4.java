/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;
import java.util.*;
/**
 *
 * @author Juan David Jaime
 * @since 14/08/17
 */
public class Clase4 {
   public static int funcion1(int dato){
        int salida=0;
        int positivo=0;
        positivo=dato*-1;
        salida=positivo;
        return salida;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prenden papi el scanner para que lea
          Scanner flujoEnt=new Scanner(System.in);
    int i=0;
    int numero=0;
    //console.log();
    System.out.println("Ingrese un numero:");
    numero=flujoEnt.nextInt();
    if(numero>0){
        while(!(i>numero)){
            System.out.println(i);
            i=i+1;
        }
             
    }else{
       
       int resultado=funcion1(numero);
        System.out.println(resultado);
    }
    
    
    
   
    
    
    }
    
}
