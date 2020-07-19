package Week04;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @CLASSNAME:GuiBinSort
 * @AUTHOR: wangteng
 * @TIME: 2020-06-3019:13
 */
public class GuiBinSort {


    public static void main(String[] args) {
//        System.out.println(0x1<<5);
        System.out.println(getInt());
    }





    private  static int getInt(){
        int a = 1;

        try{
            a = 2;
            System.out.println(a);
            return a;
        }catch (Exception e){
            a=3;
            System.out.println(a);
        }finally {
            a = 4;
            System.out.println(a);
        }
        return a;

    }

    public static void merge(int arr[],int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int t = 0;
        int temp[] = new int[high-low+1];
        while (i<=mid && j<=high){
            if (arr[i]<arr[j]){
                temp[t++] = arr[i++];
            }
            else {
                temp[t++] = arr[j++];
            }
        }
        //
        while (i<=mid){
            temp[t++] = arr[i++];
        }
        while (j<=high){
            temp[t++] = arr[j++];
        }
        //
        for (int tempLeft=0;tempLeft<temp.length;tempLeft++){
            arr[low+tempLeft] = temp[tempLeft];
        }
    }
    public static void mergeSort(int arr[],int low,int high){
        int mid = (low+high)/2;
        if (low<high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            //
            merge(arr,low,mid,high);
            System.out.println( Arrays.toString(arr));
        }
    }



}
