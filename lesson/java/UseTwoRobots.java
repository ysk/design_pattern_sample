public class UseTwoRobots {

    public static void main(String[] args) {
        Robot a = new Robot();
        a.setName("A");
        // a.name = "A";



        Robot b = new Robot();
        b.setName("B");
        // b.name = "B";

        a.sayHello();
        b.sayHello();
    }
}