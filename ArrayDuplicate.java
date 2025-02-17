class ArrayDuplicate{
    public static void main(String args[]){
        int arr[] = {3,2,3,1,2,9,2,3,3};
       // noDuplicate(arr);
        occurenceCount(arr);
    }
    static void noDuplicate(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                 if(arr[i]== arr[j]){
                     arr[j]=-1;
                 }
            }
        }
        for(int i =0 ;i<arr.length;i++){
            if(arr[i] != -1){
                System.out.print(arr[i]);
            }
        }
    }
    static void occurenceCount(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                 if(arr[i]== arr[j]){
                     count++;
                     arr[j]=-1;
                 }
            }
            if(arr[i] !=-1){
          System.out.println(arr[i] +" --> "+ count);
            }
        }
    }
}