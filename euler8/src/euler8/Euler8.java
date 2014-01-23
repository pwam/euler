/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler8;

/**
 *
 * @author pwam
 */
import java.util.*;
import java.io.*;
import java.math.*;
public class Euler8 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int[] array = new int[1000];
        File file = new File("num.dat");
        BigInteger num, var = null;
        BigInteger x = new BigInteger("10");
        int count = 0;
        int total = 1;
        int grandTotal = 0;
        int i, j;
        
        try {
            Scanner read = new Scanner(new FileInputStream(file));
            read.useDelimiter("\r\n");
            
            while(read.hasNextBigInteger()){
                var = read.nextBigInteger();
                //System.out.println(var);              
            }   
            read.close();
            
            while(count < 1000 && var != null) {
                num = var.remainder(x);
                array[count] = num.intValue();          
                var = var.divide(x);
                count++;
            }
            
            for(i=0; i<=1000; i++) {
                for(j=i+4; j>=i && j<1000; j--) {
                    total = total * array[j];                    
                }
                if(total > grandTotal)
                    grandTotal = total;
                
                total=1;
            }
            
            System.out.print(grandTotal);
            
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        
    }
    
}
