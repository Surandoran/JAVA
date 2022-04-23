package Ch12;

public class Buyer {
    //속성
    int Mymoney;        //들고있는 돈
    int AppleCnt;       //가지고있는 사과개수
    //생성자
    public Buyer(int Mymoney, int cnt){
        this.AppleCnt = cnt;
        this.Mymoney = Mymoney;
    }
    //기능
    //pay함수
    void pay(Seller seller,int money){
        //1 판매자(seller)에게 돈을 전달
        Mymoney -= money;   //내돈에서 사과가격을 뺀가격
        int cnt = seller.Receive(money); //그 돈을 판매자에게
        AppleCnt += cnt;    //사과가격만큼 내 사과갯수를 올림
    }

    //내가 가지고있는 돈과 사과개수
    void ShowInfo(){
        System.out.println("보유금액 : " + Mymoney);
        System.out.println("사과개수 : " + AppleCnt);
    }
}
