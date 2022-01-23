/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rocean
 */
public class CalculateLoan {
    private int capital;
    private double rate;
    private int duration;
    private final int[] DURATIONS = {6, 12, 24, 36};
    private final List<double[]> monthlyPayments = new ArrayList<>();

    public CalculateLoan(int capital, double rate, int duration) {
        this.capital = capital;
        this.rate = rate;
        this.duration = DURATIONS[duration];
    }
    
    public List<double[]> getMonthlyPayments() {
        double monthlyPayment = capital / duration;
        
        for (int i=0; i<duration; i++) {
           double payment = (monthlyPayment > capital) ? capital : monthlyPayment + (capital * (rate / 100) / duration);
           double[] month = {capital, payment};
           
           monthlyPayments.add(month);
           
           capital -= payment;
        }
        
        return monthlyPayments;
    }
    
    
}
