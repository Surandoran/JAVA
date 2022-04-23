package test;

//영화
public class RMain {

    public static void main(String[] args) {

        Movie case1 = new Movie(12000, "멜로가체질", "2022-04-19", "16:00" ,55);
        Movie case2 = new Movie(12000, "태양의후예", "2022-04-19", "18:00" ,70);
        Movie case3 = new Movie(12000, "이웃사람", "2022-04-19", "20:00" ,12);
        Movie case4 = new Movie(12000, "괴물", "2022-04-19", "22:00" ,30);
        Movie case5 = new Movie(12000, "캐치미이프유캔", "2022-04-19", "00:00" ,55);

        RBuy per = new RBuy(100000, "멜로가체질", 0);

        per.pay(case4, 24000);
        System.out.println("------판매한거------");
        case4.Showinfo();
        System.out.println("------구매자--------");
        per.Showinfo();

    }

}
