public class Account{
    User user;
    double balance;

    public Account(User user, double balance) {
        this.user = user;
        this.balance = balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        if(this.balance >= withdraw){
           this.balance -= withdraw;
        } else {
            System.out.println("На вашем счету недостаточно срдеств");
        }
    }
}
