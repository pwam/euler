/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler5;

/**
 *
 * @author pwam
 * 
 * Could be done faster by factoring all of the numbers between x and y and multiplying them together.
 */
public class Euler5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long x = 0;
        long y = 20;
        int count = 0;

        while(count != 20){
            count = 0;
            x++;
            for(long j=1; j<=y; j++){
                if(x % j == 0){
                    count ++;
                }
                else
                    continue;
                
                if(count == 20)
                    System.out.print(x);
            }
        }
    }
    
}
