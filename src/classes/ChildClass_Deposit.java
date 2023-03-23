package classes;

public class ChildClass_Deposit extends FatherAbstractClass {

    @Override
    public void Transactions() {
        System.out.println("¿Cuando deseás depositar?");

        Deposit();

        transactions = getBalance();
        setBalance(transactions + deposit);

        System.out.println("-----------------------------------");
        System.out.println("Depositaste: " + deposit);
        System.out.println("Tu saldo actual es: " + getBalance());
        System.out.println("-----------------------------------");

    }
}