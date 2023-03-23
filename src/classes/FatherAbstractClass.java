package classes;

import java.util.Scanner;

public abstract class FatherAbstractClass {

    // atributos privados y que pertenecen a un tipo en si mismo
    private static int balance;
    // atributos heredables
    protected int transactions, withdraw, deposit;
    // instancia para capturar el teclado
    Scanner input = new Scanner(System.in);

    // getter y setter para la variable saldo (balance)
    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        FatherAbstractClass.balance = balance;
    }

    // método para crear el menú de opciones y ejecutar cada operación
    public void Operations() {
        int flag = 0;
        int userSelection = 0;

        do {
            do {
                System.out.println("Por favor seleccioná una opción: ");
                System.out.println("    1. Consultá tu saldo.");
                System.out.println("    2. Retirá efectivo.");
                System.out.println("    3. Depositá efectivo.");
                System.out.println("    4. Salir.");

                userSelection = input.nextInt();

                if (userSelection >= 1 && userSelection <= 4) {
                    flag = 1;
                } else {
                    System.out.println("---------------------------------------------");
                    System.out.println("La opción no es correcta. Volvé a intentarlo.");
                    System.out.println("---------------------------------------------");
                }
            } while (flag == 0);

            if (userSelection == 1) {
                FatherAbstractClass handler = new ChildClass_Balance();
                handler.Transactions();
            } else if (userSelection == 2) {
                FatherAbstractClass handler = new ChildClass_Withdraw();
                handler.Transactions();
            } else if (userSelection == 3) {
                FatherAbstractClass handler = new ChildClass_Deposit();
                handler.Transactions();
            } else if (userSelection == 4) {
                System.out.println("---------------------------------");
                System.out.println("¡Gracias! esperamos verte pronto.");
                System.out.println("---------------------------------");

                flag = 2;
            }
        } while (flag != 2);
    }

    // método para retiro de efectivo
    public void Withdraw() {
        withdraw = input.nextInt();
    }

    // método para deposito de efectivo
    public void Deposit() {
        deposit = input.nextInt();
    }

    // método abstracto para aplicar polimorfismo
    public abstract void Transactions();
}