public class bitwiseopeterator {
    public static void main(String[] args) {
        
        int a, b;

        a = 27;
        b = 19;

        int and = a & b;

        int or = a | b;

        int xor = a ^ b;

        int complement = ~a;

        System.out.println("and: " + and);
        System.out.println("or: " + or);
        System.out.println("xor: "+ xor);
        System.out.println("complement of 27: " + complement);
    }
}
