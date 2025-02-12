class ArithOper {
    public static void main(String args[]){
        byte a = 127;
        byte b = 50;
        byte c = (byte) (a+b);
        System.out.println("Addition : " +c );
        System.out.println("Subtraction : " + (byte)(a - b) );
        System.out.println("Multiplication : " + (byte)(a * b) );
        System.out.println("Division : " + (byte)(a / b) );
        System.out.println("Modulus : " + (byte)(a % b) );

    }
}
