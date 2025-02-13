class Pattern{
    public static void main(String args[]){
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        pattern9(n);

    }
    static void pattern1(int n){
        for(int i = 1 ; i<=n ;i++){
            for(int j =1;j<=i;j++){
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i = 1 ; i<=n ;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i = 1 ; i<=n ;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        int count = 1;
        for(int i = 1 ; i<=n ;i++){
            for(int j = 1 ;j<=i;j++){
                System.out.print( count +" ");
                count++;
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i =  1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1 ;k<=2*i-1;k++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
    static void pattern6(int n ){
        //Upperhalf
        for(int i = 1;i<=n ;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1 ;k<=i;k++){
                System.out.print(k);
            }
            for(int l = i-1 ;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
        //Lowerhalf
        for(int i = n-1;i>=1;i--){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            for(int l =i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        //Upperhalf
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lowerhalf
        for(int i =n-1;i>=1;i--){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        static void pattern8(int n){
            //Upperhalf
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<i;k++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            //Lowerhalf
            for(int i =n-1;i>=1;i--){
                for(int j = 1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k = 1;k<  i;k++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
    }
    static void pattern9(int n){
        //Upperhalf
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==n){
                for(int k = 1;k<=2*n-1;k++){
                System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print("0");
                }
                if (i > 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}