 public  class Main {
     public static void main(String[] args) {
         System.out.println("______________НАЧАЛО РАБОТЫ БАНКОМАТА______________");

         User ivan = new User("Иван", "1234");
         Account ivanAcc = new Account(ivan, 50000.0);
         ATM atm = new ATM(ivanAcc);
         atm.start();
     }
}