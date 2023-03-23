package classes;

public class MainClass {
    public static void main(String[] args) {

        FatherAbstractClass session = new ChildClass_Balance();
        session.setBalance(500);
        session.Operations();
    }
}