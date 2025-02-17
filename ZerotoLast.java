class ZerotoLast{
    public static void main(String args[]){
        //int arr[] = {1,1,1,0,0,1,0,1,0};
        int arr[] = {1,3,4,5,0,6,7,9,0,5,0,3};
        int ind = 0;
        for(int i = 0 ;i<arr.length;i++){
            
            if(arr[i]!=0){
                arr[ind]=arr[i];
              ind++;
              
            }
        }
              while(ind < arr.length){
                  arr[ind] = 0;
                  ind++;
             }
        for(int i : arr){
        System.out.print(i);
        }
    }
}