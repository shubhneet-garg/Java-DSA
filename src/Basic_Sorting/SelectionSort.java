package Basic_Sorting;  // find minimum element & swap that to first

public class SelectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);

//        for(int i=0;i<n-1;i++){
//            int min = Integer.MAX_VALUE, mindx = -1;
//            for(int j=i;j<n;j++){
//                if(arr[j]<min){
//                    min = arr[j];
//                    mindx = j;
//                }
//            }
//            // swap
//            int temp = arr[i];
//            arr[i] = arr[mindx];
//            arr[mindx] = temp;
//        }

        // 2 Sum - Find a pair with given sum
//          class Solution{
//              boolean twoSum(int arr[], int target){
//                  Arrays.sort(arr);
//                  int i=0, j=arr.length-1;
//                  while(i>j){
//                      if(arr[i]+arr[j]==target) return true;
//                      else if(arr[i]+arr[j]>target) j--;
//                      else if(arr[i]+arr[j]<target) i++;
//                  }
//                  return false;
//              }
//          }

        // k
        print(arr);
    }
}