/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatos59818;

/**
 *
 * @author caroc
 */
public class TiposDeDatos59818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    byte minby = Byte.MIN_VALUE;
    byte maxby = Byte.MAX_VALUE;

    short minsho = Short.MIN_VALUE;
    short maxsho = Short.MAX_VALUE;

    int minint = Integer.MIN_VALUE;
    int maxint = Integer.MAX_VALUE; 
    
    long minlong = Long.MIN_VALUE; 
    long maxlong = Long.MAX_VALUE; 
    
    double mindouble = Double.MIN_VALUE; 
    double maxdouble = Double.MAX_VALUE;
    
   System.out.println("Valor minimo de Byte: " + minby);  
   System.out.println("Valor maximo de Byte: " + maxby);  
   
   System.out.println("Valor minimo de Short: " + minsho);  
   System.out.println("Valor maximo de Short: " + maxsho);
   
   System.out.println("Valor minimo de Int: " + minint);  
   System.out.println("Valor maximo de Int: " + maxint); 
   
   System.out.println("Valor minimo de Long: " + minlong);  
   System.out.println("Valor maximo de Long: " + maxlong); 
   
   System.out.println("Valor minimo de Double: " + mindouble);  
   System.out.println("Valor maximo de Double: " + maxdouble); 
  } 
}
