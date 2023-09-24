package oneweek;

public class Driver {
    public static void main(String[] args) {
        CheckCardAccount card=new CheckCardAccount("선남","1001","0912");

        card.setBalance(100000);
        System.out.println("100000원을 입금한다.");
        System.out.println("상품을 구매한다.");

        card.AddBalance(card);
        card.contine();
        card.withdraw();
        card.result(card);
    }

}
