class SumNum {
    public static void main(String args[]){
        int num = 123456;
        evenSum(num);
        oddSum(num);
        primeSum(num);
        evenRev(num);
        oddRev(num);
    }
    static void evenSum(int num){
        int sum = 0;
        //Extract Digit From End
        while(num >0){
            int dig = num % 10;
            if(dig%2 == 0){
                System.out.print(dig);
                sum+=dig;
            }
            num = num/10;
        }
        System.out.println();
        System.out.println("Evensum : " + sum);  
    }

static void oddSum(int num){
    int sum = 0;
    while(num >0){
        int dig = num % 10;
        if(dig%2 != 0){
            System.out.print(dig);
            sum+=dig;
        }
        num = num/10;
    }
    System.out.println();
    System.out.println("OddSum : " + sum);  
}
static void primeSum(int num){
        int sum = 0;
        while(num>0){
        boolean isPrime=true;
        int dig = num %10;
        if(dig<=1){
            isPrime=false;
        }
        for(int i = 2 ;i<dig;i++){
            if(dig % i == 0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.print(dig);
            sum+=dig;
        }
        num = num/10;
        
    }
    System.out.println();
    System.out.println("PrimeSum : " + sum);
    }
    //Print Even No From Begin
    static void evenRev(int num){
    int even = 0;
    int place = 1;
    while(num>0){
        int dig = num % 10;
        if(dig%2 == 0){
            even = even+(dig*place);
            place = place*10;
        }
        num = num/10;
    }
    System.out.println(even);
}
//Print Even No From Begin
static void oddRev(int num){
    int odd = 0;
    int place = 1;
    while(num>0){
        int dig = num % 10;
        if(dig%2 != 0){
            odd = odd+(dig*place);
            place = place*10;
        }
        num = num/10;
    }
    System.out.println(odd);
}
}


