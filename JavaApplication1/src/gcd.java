/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 24;
        int b = 16;
        
        System.out.printf("gcdPrimeFactors: %d\n", gcdPrimeFactors(a, b));
        System.out.printf("gcdEucledian: %d\n", gcdEucledian(a, b));
    }
    
    public static int gcdPrimeFactors(int a, int b){
        int sum = 1;
        int primeFactor = 2;
        while(a != 1){
            if(a % primeFactor == 0 && b % primeFactor == 0){
                sum *= primeFactor;
                a /= primeFactor;
                b /= primeFactor;
            }
            else if(a % primeFactor == 0)
                a /= primeFactor;
            else if(b % primeFactor == 0)
                b /= primeFactor;
            else
                primeFactor++;
        }
        return sum;
    }
    
    public static int gcdEucledian(int a, int b){
        if(b == 0) return a;
        return gcdEucledian(b, a % b);
    }
}
