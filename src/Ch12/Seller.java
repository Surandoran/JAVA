package Ch12;

public class Seller {
    //속성
    int Mymoney;        //판매자가 가지고 있는돈
    int Applecnt;       //판매자가 가지고 있는 사과개수
    int price;          //사과의 가격

    //생성자
    public Seller(int mymoney, int applecnt,int price) {
        Mymoney = mymoney;
        Applecnt = applecnt;
        this.price = price;
    }


    //기능
    //Receive();!!
    //돈을받아 -> 내보유금액에저장 -> 사과개수계산 -> 사과개수차감 -> 사과개수 리턴
    int Receive(int money){ //구매자의 돈을 받기위해 변수지정
        Mymoney +=money;        //구매자의 돈을 내 돈에 +함
        int cnt = money/price;  //구매자의 돈/사과 가격을 나누면 1이 나오기떄문에 cnt를 사과개수로 지정
        Applecnt -= cnt;        //1만큼 판매자의 사과개수가 줄어듬 그 줄어든걸 구매자의 사과개수(return)로 감
        return cnt;             //return 함수로 구매자의 사과개수로 감
    }
    //판매자가 현재 가지고 있는 돈과 사과개수,그리고 사과의 가격
    void ShowInfo(){
        System.out.println("보유금액 : " + Mymoney);
        System.out.println("사과개수 : " + Applecnt);
        System.out.println("사과가격 : " + price);
    }
}
