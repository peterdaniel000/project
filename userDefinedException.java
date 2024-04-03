class   BelowAgeException extends Exception{
    BelowAgeException() {
        super("Age is under 18");
    }
}

    class Application {
        private String name;
        private String course;
        private int age;
        public Application(String name, String course) {
            this.name = name;
            this.course = course;
            age = 18;
        }

        public Application() {
            this("", "");
        }

        public void setAge(int age) throws BelowAgeException {
            if (age < 18)
                throw new BelowAgeException();
            else 
            this.age = age;
        }

        public void displayDetails() {
            System.out.println("The name of the student: " + name);
            System.out.println("Course applied for: " + course);
            System.out.println("Applicant age: " + age);
            System.out.println();
        }
    }

public class userDefinedException {
    public static void main(String[] args) {
        Application application1 = new Application("jhon", "java programming");
        Application application2 = new Application("daniel", "operating system");

        application1.displayDetails();

        try {
            application2.setAge(17);
        } catch (BelowAgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
