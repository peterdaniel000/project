class myClass {
    private int a, b;

    public myClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public myClass() {
        this(0, 0);
    }

    public void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("the values of a and b are: " + a + " and " + b);
    }
}

    
public class thisKeyword {
    public static void main(String[] args) {
        myClass myObj = new myClass();
        myObj.display();
        myObj.setData(23, 24);
        myObj.display();
    }
}
