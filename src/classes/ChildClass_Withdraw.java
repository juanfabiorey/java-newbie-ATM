package classes;

public class ChildClass_Withdraw extends FatherAbstractClass {

    @Override
    public void Transactions() {
        System.out.print("¿Cuanto deseás retirar?");

        Withdraw();

        if (withdraw <= getBalance()) {
            transactions = getBalance();
            setBalance(transactions - withdraw);

            System.out.println("-----------------------------------");
            System.out.println("Retiraste: " + withdraw);
            System.out.println("Tu saldo actual es: " + getBalance());
            System.out.println("-----------------------------------");
        } else {
            System.out.println("-------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("-------------------");
        }
    }
}