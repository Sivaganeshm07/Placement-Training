class PrimeNo {
 public static void main(String args[]){
    int n = 1000 ;
    int count = 2;
    for(int i = 2 ; i<n ;i++){
        if(n % i == 0){
            count++;
        }
    }
        if(count > 2){
           System.out.println("Not a Prime Num");
        }
        else{
            System.out.println("Prime Num");
        }
        //Generate Prime No 
        for(int i = 2 ;i<=n ;i++){
            boolean isPrime = true;
        for(int j = 2 ;j*j<=i ;j++){
            if(i%j == 0){
                isPrime = false;
                break;
            }
        }
            if(isPrime){
                System.out.println(i);
            }
        
     }
       
    }
}