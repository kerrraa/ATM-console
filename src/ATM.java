import java.util.Scanner;

public class ATM {
    Scanner scan;
    Account acc;

    public ATM(Account acc){
        this.acc = acc;
        this.scan = new Scanner(System.in);
    }

    private boolean authenticate(){
        System.out.println("Введите имя: ");
        String inputName = scan.nextLine();
        System.out.print("Введите пин-код ");
        String inputPin = scan.nextLine();

        if (inputName.equals(this.acc.user.name) && inputPin.equals(this.acc.user.pin)){
            System.out.println("_____Добро пожаловать " + this.acc.user.name + "!_____");
            return true;
        } else {
            System.out.println("Введено неверно имя или пароль!");
            return false;
        }
    }

    public void  start() {
        if (!authenticate()){
            System.out.println("Работа банкомата завершена...");
            return;
        }

        while (true){
            System.out.println("МЕНЮ");
            System.out.println(" 1 - Баланс\n 2 - Пополнение счёта\n 3 - Снять с счёта\n 4 - ВЫХОД");

            int num = scan.nextInt();

            switch (num) {
                case 1:
                    System.out.println("На счету: " + this.acc.balance);
                    break;
                case 2:
                    System.out.println("Введите сумму пополнения: ");
                    double deposit = scan.nextDouble();
                    this.acc.deposit(deposit);
                    break;
                case 3:
                    System.out.println("Введите сумму снятия: ");
                    double withdraw = scan.nextDouble();
                    this.acc.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println("Хорошего дня " + this.acc.user.name + "!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Несушествующий пункт в меню!");
            }
        }
    }
}