/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Second_Part;

import java.util.Scanner;

/**
 *
 * @author Saky
 */

public class Methods {
    public static void GrowingNumbers(int a[]){
        for (int i = 0; i < a.length*2; i++) {
            if(a[0] > a[1]){
                int tmp = a[0];
                a[0] = a[1];
                a[1] = tmp;
            }
            if(a[1] > a[2]){
                int tmp = a[1];
                a[1] = a[2];
                a[2] = tmp;
            }
        }
        System.out.println(a[0] + ", " + a[1] + ", " + a[2] );
    }
    
    public static void MinAbsax(double b[]){
        double[] c = new double[2];
        c[0] = b[0];
        c[1] = b[0];
        for (int i = 0; i < b.length-1; i++) {
            if(b[i+1] < c[0])
                c[0] = b[i+1];
            if(b[i+1]<0)
                b[i+1] = b[i+1] * -1;
            if(b[i+1] > c[1])
                c[1] = b[i+1];
        }
        System.out.println("Minimum=" + c[0] + ", Absolut maximum=" + c[1]);
    }
    
    public static void Sequence(double a[]){
        System.out.println(a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3]);
        if(a[3] >= 0)
            System.out.println(a[0] + ", " + a[2] + ", " + a[1] + ", " + a[3]);
        else
            System.out.println(a[0] + ", " + a[1] + ", " + a[3] + ", " + a[2]);
    }
    
    public static boolean CanItBeRectangle( int a[]){
        boolean ans;
        if(a[0] + a[1] < a[2])
            ans = false;
        else if(a[0] + a[2] < a[1])
            ans = false;
        else if(a[1] + a[2] < a[0])
            ans = false;
        else
            ans = true;
        return ans;
    }
    
    public static int LeapYear(int a, int b){
        int first = a / 4;
        first = first - a / 100;
        first = first+ a / 400;
        int second = b /4;
        second = second - a / 100;
        second = second + a / 400;
        if(first - second < 0)
            return (first - second) * -1;
        else
            return first - second;
    }
    
    public static void GradeToString(int grade){
        switch(grade){
                case(1):
                    System.out.println("Fail!");
                    break;
                case(2):
                    System.out.println("Sufficient!");
                    break;
                case(3):
                    System.out.println("Fair!");
                    break;
                case(4):
                    System.out.println("Good!");
                    break;
                case(5):
                    System.out.println("Excellent!");
                    break;
                default:
                    System.out.println("Not a grade!");
        }
    }
    
    public static int Ratio(int a, int b){
        int ratio = 0;
        while(a>=b){
            ratio++;
            a -= b;
        }
        return ratio;
    }
    
    public static boolean IsItPrime(int a, boolean ans){
        ans = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0)
                ans = false;
        }
        return ans;
    }
    
    public static void Fibonacci(int n){
        int a = 1;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            if(i == n )
                System.out.print(b);
            else
                System.out.print(b + ", ");
            b = b + a;
            a = b - a;
        }
        System.out.println("");
    }
    
    public static long Reverse(long n){
        long b = 0;
        while(n!=0){
            b = b * 10 + n % 10;
            n = n / 10;
        }
        return b;
    }
    
    public static long Factorial(int n){
        long ans=1;
        String s;
        for (int i = 1; i < n+1; i++) {
            ans = ans * i;
        }
        return ans;
    }
    
    public static void Divides(int a, int b, int div){
        for (int i = a; i < b; i++) {
            if(i % div == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
    public static long JustBiggerFibonacci(long a){
        long ans=1;
        int i = 1;
        while(ans < a){
            ans *= i;
            i++;
        }
        return ans;
    }
    
    public static void EqualButWeird(){
        for (int i = 0; i < 1000; i++) {
            int first=0, second=0, third=0;
            if(i>=100){
                first = i / 100;
                second = (i % 100) / 10;
                third = (i % 100) % 10;
            }
            else if(i>=10){
                second = i / 10;
                third = i % 10;
            }
            else
                third = i;
            if(i == Math.pow(first, 3) + Math.pow(second, 3) + Math.pow(third, 3))
                System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        int[] a = new int[3];
        double[] b = new double[3];
        double[] c = new double[4];
        int[] d = new int[3];
        int yearOne, yearTwo;
        int grade;
        int[] e = new int[2];
        int prime; boolean isItPrime=false;
        int fibo;
        long needToBeReversed, reversed;
        int factorNeeded; long factor;
        int start, stop, div;
        long needToBeBiggerThanThis;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Please write 3 int for GrowingNumbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        GrowingNumbers(a);
        System.out.println("2. Please write 3 double for MinAbsMax:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextDouble();
        }        
        MinAbsax(b);
        System.out.println("3. Please write 4 doubles for Sequence:");
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextDouble();
        }
        Sequence(c);
        System.out.println("4. Please write 3 ints for Rectangle:");
        for (int i = 0; i < d.length; i++) {
            d[i] = sc.nextInt();
        }
        if(CanItBeRectangle(d))
            System.out.println("They can be a rectangle!");
        else
            System.out.println("They can't be a rectangle!");
        System.out.println("5. Please write 2 years:");
        yearOne = sc.nextInt();
        yearTwo = sc.nextInt();
        int leapYears = LeapYear(yearOne, yearTwo);
        System.out.println(leapYears);
        System.out.println("6. Please write the grade(1-5) for GradeToString:");
        grade = sc.nextInt();
        GradeToString(grade);
        System.out.println("7. Please write two integers for Ratio:");
        for (int i = 0; i < e.length; i++) {
            e[i] = sc.nextInt();
        }
        System.out.println(Ratio(e[0], e[1]));
        System.out.println("8. Please write an int for IsItPrime:");
        prime = sc.nextInt();
        if(IsItPrime(prime, isItPrime))
            System.out.println(prime + " is a prime!");
        else
            System.out.println(prime + " is not a prime!");
        System.out.println("9. Please write an int for Fibonacci:");
        fibo = sc.nextInt();
        Fibonacci(fibo);
        System.out.println("10. Please write a long for Reverse:");
        needToBeReversed = sc.nextLong();
        System.out.println(Reverse(needToBeReversed));
        System.out.println("11. Please write an int for Factorial:");
        factorNeeded = sc.nextInt();
        System.out.println(Factorial(factorNeeded));
        System.out.println("12. Please write 3 int for Divides (the first two is the start and stop, third is the divider):");
        stop = sc.nextInt();
        start = sc.nextInt();
        div = sc.nextInt();
        Divides(stop, start, div);
        System.out.println("13. Please write a long for JustBiggerFibonacci:");
        needToBeBiggerThanThis = sc.nextLong();
        System.out.println(JustBiggerFibonacci(needToBeBiggerThanThis));
        System.out.println("14. EqualbutWierd:");
        EqualButWeird(); //14 
    }
}
