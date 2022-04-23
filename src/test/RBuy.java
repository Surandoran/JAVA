package test;

public class RBuy {
    //구매자의 돈, 보고싶은 영화, 티켓소지수
    int money;
    String name;
    int ticket;

    public RBuy(int Money,String name,int ticket){
        money = Money;
        this.name = name;
        this.ticket = ticket;
    }

    void pay(Movie movie, int money){
        this.money -= money;
        int cnt = movie.Resel(money);
       ticket += cnt;
    }

    void Showinfo(){
        System.out.println("구매자의 잔액 : " + money);
        System.out.println("보고싶은 영화 : " + name);
        System.out.println("티켓 소지수 : " + ticket);
        System.out.println("-------------------------");
    }
}
