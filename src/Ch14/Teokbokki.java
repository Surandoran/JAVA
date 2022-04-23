package Ch14;
class TeokbokkiRecp {
    private void step1(){
        System.out.println("후라이팬에 떡과 물(종이컵 2컵)과 설탕(3스푼)을 넣고 끓인다");
    };
    private void step2(){
        System.out.println("보글보글 끓으면 고추장을 밥숟가락으로 한스푼 넣어준다");
    };
    private void step3(){
        System.out.println("고추장이 뭉치지 않게 잘 풀어주고 간장 2스푼도 넣어준다");
    };
    private void step4(){
        System.out.println("고춧가루 1.5스푼 넣어준다");
    };
    private void step5(){
        System.out.println("마지막으로 총총 썰은 파를 넣고 잘 버무리면 벌써 끝");
    };

    public void Cooking(){
        System.out.println("떡볶이!!!");
        step1();
        step2();
        step3();
        step4();
        step5();
    }

}
class Cook{
    TeokbokkiRecp TBK;
    Cook() {
        TBK = new TeokbokkiRecp();
    }
    void 요리사(){
        TBK.Cooking();
    }
}
public class Teokbokki {

    public static void main(String[] args) {
        Cook MrJung = new Cook();
        MrJung.TBK.Cooking();

    }

}
