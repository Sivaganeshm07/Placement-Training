import java.util.Scanner;
class Arrayex {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    // System.out.println(" Enter The N : ");
    // int n = in.nextInt();
    // int arr[] = new int [n];
    // for(int i = 0; i<n;i++){
    //     arr[i] = in.nextInt();
    
    // }
    //arrayPrint(arr);
    maxElement(arr);
    }
    static void arrayPrint(int arr[]){
    System.out.println("For Each Loop");
    for(int i : arr){
        System.out.print(i + " ");
     }
     System.out.println();
     System.out.println("For Loop");

     for(int i = 0 ;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
     }
     System.out.println();
     System.out.println("For Loop Reverse Order");

     for(int i = arr.length-1 ;i>=0 ;i--){
        System.out.print(arr[i]+ " ");
     }
     System.out.println();
     System.out.println("For Each Loop");
     for(int i : arr){
        i++;
         System.out.print(i + " ");
      }
    }
    static void maxElement(int arr[]){
        int max = arr[0];
        int max2 = -1;
        int max3 = -1;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
       for(int i = 0;i<arr.length;i++){
        if(arr[i] > max2  && arr[i]!=max){
            max2 = arr[i];
        }
    }
    for(int i = 0 ;i<arr.length;i++){
        if(arr[i]>max3 && arr[i]!=max && arr[i]!=max2){
            max3= arr[i];
        }
    }
        System.out.println("1st Max Element : " + max);
        System.out.println("2nd Max Element : " + max2);
        System.out.println("3rd Max Element : " + max3);
    }

}
