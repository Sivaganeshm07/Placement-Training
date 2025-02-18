class AdditionArray{
    public static void main(String args[]){
        int a[] = {5,1,3};
        int b[] = {9,7,7,7};
        int max =Math.max(a.length,b.length);
        int c[] = new int[max+1];
        int carry = 0;
        //Addition From Left To Right
        for(int i = 0;i<c.length ; i++){        // Addition From Right To Left for(int i = c.length-1;i>=0 ; i--)
           if(i<a.length){
               c[i]+=a[i];
           }
           if(i<b.length){
               c[i]+=b[i];
           }
            c[i] += carry;
            if(c[i] >= 10){
                carry = c[i]/10;
                c[i] = c[i]%10;
            }
            else{
                carry = 0 ;
            }
        }
        for(int i : c){
            System.out.print(i+ " ");
        }
    }
 }

