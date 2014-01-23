/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler4;

/**
 *
 * @author pwam
 */
import java.util.*;
public class Euler4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack x = new Stack();
        Stack y = new Stack();
        Stack z = new Stack();
        int count = 0;
        int var1 = 0;
        int num0 = 0;
        int num1 = 0;
        
        for(int i=100; i<1000; i++) {
            for(int j=100; j<1000; j++) {
                int var = i*j;
                
                while(var != 0) {
                    int var2 = var % 10;
                    x.push(var2);
                    z.push(var2);
                    var = var / 10;
                    count++;
                    //System.out.print(var2);
                }
                
                while(count > 0) {
                    int var3 = (Integer) x.pop();
                    y.push(var3);
                    //System.out.print(var3);
                    count--;
                }
                
                count = 0;
                
                while(!z.isEmpty() && !y.isEmpty()) {
                    int a = (Integer) z.pop();
                    int b = (Integer) y.pop();
                    //System.out.println(a + b);
                    
                    if(a != b) {
                        var1 = 1;
                        break;
                    }                      
                }
                
                if(var1 == 0) {
                    num0 = i;
                    num1 = j;
                }
                var1 = 0;
            }
        }
        
        System.out.println(num0 + "*" + num1);
    }
    
}
