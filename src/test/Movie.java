package test;

public class Movie {
    //영화티켓비용,이름,상영날짜,시간,남은표
    int money;
    String name;
    String day;
    String time;
    int x;

    public Movie(int Money, String Name, String Day, String Time,int x){
        money = Money;
        name = Name;
        day = Day;
        time = Time;
        this.x = x;
    }
    int Resel(int money){

        int cnt = money / this.money;
        this.x -= cnt;
        return cnt;
    }

    void Showinfo(){
        System.out.println("영화티켓비용 : " + money);
        System.out.println("영화이름 : " + name);
        System.out.println("상영날짜 : " + day);
        System.out.println("상영시작시간 : " + time);
        System.out.println("남은 티켓 수 : " + x);
        System.out.println("------------------------");
    }



}
