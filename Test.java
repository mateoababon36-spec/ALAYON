/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        int[]numbers={4,9,7,1,3,2,0};
        InsertionSort  is  = new InsertionSort(numbers);
        
        
        System.out.print("Original Array:");
        is.display();
        System.out.println("\nSorting Process");
        is .sort();
        
        is.display();
        
    }
    }

