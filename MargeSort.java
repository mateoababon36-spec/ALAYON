/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class MargeSort {
    
    static void merge(int[]arr, int left,int mid,int right){
        int[] temp =new int[right - left +1];
        
        
        int i= left;
        int j=mid +1;
        int k=0;
        
        while(i<=mid &&j<= right){
            if (arr[i]<=arr[j]){
                temp[k++]= arr[i++];
                
            }else{
                temp[k++]=arr[j++];
            }
            while(i<= mid){
                temp[k++]= arr[j++];
            }
            while(i <= right){
                temp[k++]=arr[j++];
            }
            for(i=0;i< temp. length; i++){
                arr[left +1]= temp[i];
            }
        }
        
   }
}
