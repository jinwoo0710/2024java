//실습문제 8번문제
class Account{
    int balance;
    Account(){
        balance = 0;
    }
    void deposit(int money){
        balance += money;
    }
    void deposit(int[] money){
        for(int i = 0; i < money.length; i++){
            balance += money[i];
        }
    }
    int getBalance(){
        return balance;
    }
    int withdraw(int money){
        if(balance < money){
            return balance;
        }else{
            balance -= money;
            return money;
        }
    }
}
public class report9 {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(5000);
        System.out.println("잔금은 " + a.getBalance());

        int bulk[] = {100, 500, 200, 700, 300};
        a.deposit(bulk);
        System.out.println("잔금은 " + a.getBalance());

        int money = 1000;
        int wMoney = a.withdraw(money);
        if(wMoney < money){
            System.out.println(wMoney + "원만 인출");
        }else{
            System.out.println(money + "원 인출");
        }

        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}
