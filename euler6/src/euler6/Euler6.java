/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler6;

/**
 *
 * @author pwam
 */
public class Euler6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long y = 100;
        long sumSquares = 0;
        long squaredSum = 0;
        long sum = 0;
        
        long total;
        
        for(int i = 0; i<=y; i++){
            sumSquares += Math.pow(i,2);
            squaredSum += i;
        }
        
        sum += Math.pow(squaredSum,2);
        
        total = (sum - sumSquares);        
        System.out.println(total);
    }
    
}
