package oneweek;

import java.util.Scanner;

public class CheckCardAccount {
    Scanner sc=new Scanner(System.in);
    private String name;
    private String AccountNum;
    private String expireDate;
    private int balance;

    public CheckCardAccount(String name, String accountNum, String expireDate) {
        this.name = name;
        this.AccountNum = accountNum;
        this.expireDate = expireDate;
      //  this.balance = balance=0;

    }

    public boolean IdentityCheck(String name, String AccountNum, String expireDate){
        if(name.equals(this.getName())
                &&AccountNum.equals(getAccountNum())
                &&expireDate.equals(getExpireDate())){
            return true;
        }
        return false;
    }

    public void AddBalance(CheckCardAccount card ){

        System.out.println("청구 금액을 입력하세요: ");
        int addmoney=sc.nextInt();
        System.out.println("고객 이름을 입력하세요: ");
        String name=sc.next();
        System.out.println("고객 번호를 입력하세요: ");
        String account=sc.next();
        System.out.println("카드 만기연월을 입력하세요: ");
        String date=sc.next();

        if(IdentityCheck(name,AccountNum,expireDate)){
            System.out.println("신원 확인 성공");
            if(card.getBalance()>=addmoney){
                int restmoney=card.getBalance()-addmoney;
                card.setBalance(restmoney);
            }else{
                System.out.println("잔고초과");
            }
        }else{
            System.out.println("신원 확인 실패");
        }

    }

    public void contine(){
        System.out.println("계속하시겠습니까(true 혹은 false): ");
        String start=sc.next();
        while(true){
            if(start.equals("true")){
                this.AddBalance(this);//잘 모르겠다
            }else if(start.equals("false")){
                this.AddBalance(this);
                break;
            }
        }
    }
    public void withdraw(){
        System.out.println("20000원을 출금한다");
        System.out.println();
        this.setBalance(this.getBalance()-20000);
    }

    public void result(CheckCardAccount checkCardAccount){
        System.out.println("예금주 이름: "+ checkCardAccount.getName());
        System.out.println("계좌번호: "+checkCardAccount.getAccountNum());
        System.out.println("만기연월: "+checkCardAccount.getExpireDate());
        System.out.println("잔고: "+checkCardAccount.getBalance());

    }
    public String getName() {
        return name;
    }

    public String getAccountNum() {
        return AccountNum;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
