/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class QuickSort {
   int[]numbers;
   
    public QuickSort(int[] numbers) {
        this.numbers =numbers;
        
        
    }
    public void Sort(){
        quickSort(0, numbers.length-1);
    }
    public  void quickSort(int low, int high) {
        if(low < high){
            int pivot = numbers [high];
            int i=low -1;
            for(int j = low; j < high; j++){
                
                if (numbers[j] < pivot){
                    i++;
                     
                    int temp = numbers[i];
                    numbers[i]= numbers [i];
                    numbers[j]= temp;
                    
                }
            }
            int temp = numbers [i+1];
            numbers[i + 1]= numbers [high];
            numbers[high]=temp;
            
            int pivotindex= i+1;
            
            quickSort(low,pivotindex -1);
            quickSort(pivotindex + 1, high);
            
        }
        
    }
    public void print(){
        System.out.println("Sorted numbers says:");
        for(int number : numbers){
            System.out.print(number +"");
            
        }
        System.out.println("");
    }
}
