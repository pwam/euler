/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler7;

/**
 *
 * @author pwam
 */
public class Euler7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long x = 10;
        long y = 0;
        long count = 0;
        long prime;
        long var = 2;
        
        while(count != x) {
            for(int i=1; i<=(var/2); i++) {
            if(i % var == 0)
                y++;
            if(y >=2)
                continue;
            else
                count++;
            }
            var++;
            System.out.println(var);
                          
        }
        
        System.out.println(var);
        
    }
    
}
