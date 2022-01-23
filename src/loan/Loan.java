/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import javax.swing.JFrame;

/**
 *
 * @author rocean
 */
public class Loan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoanFrame loanFrame = new LoanFrame();
        loanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        loanFrame.setSize(1000,600);
        loanFrame.setVisible(true); 
    }
    
}
