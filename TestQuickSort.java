/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class TestQuickSort {
    
    public static void main(String[] args) {
        
        int[] numbers = {10,7,8,9,1,5};
        
        QuickSort quickSort =new QuickSort(numbers);
        
        quickSort.Sort();
        
        quickSort.print();
    }
}
