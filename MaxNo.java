class MaxNO {
    public static void main(String args[]){
        int a = 1;
        int b = 50;
        int c = 60;
        if(a>b && a>c){
            System.out.println("A is Greatest");
        }
        else if(b>c){
            System.out.println("B is Greatest");
        }
        else{
            System.out.println("C is Greatest");
        }
        System.out.println((a>b && a>c));
        System.out.println((b>c));
        System.out.println((c>b && c>a));
        System.out.println((a>b && a>c ? "A is Greatest":(b>c)? "B is Greatest":"C is Greatest"));

    }
    
}
