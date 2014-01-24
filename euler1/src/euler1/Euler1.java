/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euler1;

/**
 * @author pwam
 */
public class Euler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	
	double x = 0;
	double out1, out2;

	for(int i = 1; i < 1000; i++) {
	    out1 = i % 3;
	    out2 = i % 5;
	    
	    if(out1 == 0 || out2 == 0)
		System.out.println(x+=i);
	}
    }
    
}
