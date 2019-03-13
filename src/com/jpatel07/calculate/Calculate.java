package com.jpatel07.calculate;

/**
 *
 * @author jpatel07
 */

import java.util.Scanner;

public class Calculate {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();
        
        int[] nums = new int[3];
        
        nums[0] = num1;
        nums[1] = num2;
        nums[2] = num3;
        
        int sum = sum(nums);
        int average = average(nums);
        int product = product(nums);
        int smallest = smallest(num1, num2, num3);
        int largest = largest(num1, num2, num3);
        
        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The smallest is %d%n", smallest);
        System.out.printf("The largest is %d%n", largest);
        
        input.close();
        
    }
    
    public static int sum(int[] i) {
        return i[0] + i[1] + i[2];
    }
    
    public static int average(int[] i) {
        int s = sum(i);
        return s/3;
    }
    
    public static int product(int[] i) {
        return i[0] * i[1] * i[2];
    }
    
    public static int smallest(int i, int i2, int i3) {
        if (i <= i2) {
             if (i <= i3){
                return i;
            }
        }
         if (i2 <= i) {
            if (i2 <= i3){
                return i2;
            }
        }
        if (i3 <= i) {
            if (i3 <= i2){
                return i3;
            }
        }
        return 0; //shouldn't happen
    }
    
    public static int largest(int i, int i2, int i3) {
       if (i >= i2) {
            if (i >= i3){
                return i;
            }
        }
       if (i2 >= i) {
            if (i2 >= i3){
                return i2;
            }
        }
       if (i3 >= i) {
            if (i3 >= i2){
                return i3;
            }
        }
        return 0; //shouldn't happen
    }
}


