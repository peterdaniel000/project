public class bitwiseopeterator {
    public static void main(String[] args) {
      
        int a, b;

        a = 27;
        b = 19;
// 27 = 0000 1011
// 19 = 0001 0011
// 8 = 0000 1000
        int and = a & b;

        int or = a | b;

        int xor = a ^ b;

        int complement = ~a;

        System.out.println("and: " + and);
        System.out.println("or: " + or);
        System.out.println("xor: "+ xor);
        System.out.println("complement of 27: " + complement);

        int rightshift = a >> 2;
        int leftshift = a << 2;
        int rightshiftzero = a >>> 2;

        System.out.println("rightshift: " + rightshift);
        System.out.println("leftshift: " + leftshift);
        System.out.println("rightshiftzero: " + rightshiftzero);
    }
}
