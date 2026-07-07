package Basic_Sorting; // swap adjacent elements

public class BubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {5, -2, 6,  7, 2, 0, 7, 2};
        int  n = arr.length;
        print(arr);

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);

        //More Bubble sort optimized if array is sorted by boolean
//        for(int i=0;i<n-1;i++){
//            boolean isSorted = true;
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    isSorted = false;
//                }
//            }
//            if(isSorted == true) break;
//        }
//        print(arr);

        // Simple optimized if array is sorted by integer
//        for(int i=0;i<n-1;i++){
//            int swaps = 0;
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swaps++;
//                }
//            }
//            if(swaps == 0) break;
//        }
//        print(arr);

        // for print in reverse order
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]<arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        print(arr);

        // Move all zeros to end of an array
//        class Solution{
//            void pushzerostoend(int[] arr){
//                int n=arr.length;
//                int j=0;
//                for(int i=0;i<n;i++){
//                    if(arr[i]!=0){
//                        if(i!=j){
//                            int temp=arr[i];
//                            arr[i]=arr[j];
//                            arr[j]=temp;
//                        }
//                        j++;
//                    }
//                }
//            }
//        }

    }
}