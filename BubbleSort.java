
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class BubbleSort {
    int[]numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

   public void swapped(int index){
       int left=numbers[index];
       int right=numbers[index+1];
       
       
       numbers[index]= right;
        numbers[index+1]=left;
        
        
   }
   public void print(){
       for(int number: numbers){
           System.out.println("numbers");
           
       }
   }
   public void sort(){
       for(int i=0;i<numbers.length;i++){
           System.out.println("iterration%d\n"+1);
           for(int index =0; index< numbers.length-1;index++){
                System.out.printf("ndex%d:=%d=>",index,numbers[index]);
                
                if (numbers[index]> numbers[index+1])
                    swapped(index);
                
                
               
           }
           print();
           System.out.println("");
               
                   
       }
   }
    }

