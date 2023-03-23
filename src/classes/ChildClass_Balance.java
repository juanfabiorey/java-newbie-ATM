package classes;

public class ChildClass_Balance extends FatherAbstractClass {

    @Override
    public void Transactions() {
        System.out.println("-----------------------------------");
        System.out.println("Tu saldo actual es: " + getBalance());
        System.out.println("-----------------------------------");
    }
}