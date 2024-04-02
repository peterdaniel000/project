class Student {
    String name;
    int id;
    String major;

    void setName(String stName) {
        name = stName;
    }

    void setId(int pin) {
        id = pin;
    }

    void setMajor(String subject) {
        major = subject;
    }

    void display() {
        System.out.println("the student name is: " + name);
        System.out.println("the student id is: " + id);
        System.out.println("the student major subject is: " + major);
        System.out.println();
    }
}
public class objectClass {
    public static void main(String[] args) {
        Student s1, s2;
            s1 = new Student();
            s2 = new Student();

            s1.setName("daniel");
            s1.setId(1234);
            s1.setMajor("Informatoin systems");

            s2.setName("isaiah");
            s2.setId(3454);
            s2.setMajor("math");

            s1.display();
            s2.display();
    }
}
