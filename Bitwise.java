class Bitwise {
    public static void main(String arrgs[]){
        int a = 492 ;
        int b = 333;
        //Binary Print
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(Integer.toBinaryString(b));

        //Decimal Print
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(Integer.toBinaryString(10<<2));

    }
    
}
