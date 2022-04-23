package Ch19;

import java.util.SortedMap;

class Store{
    static double sales; //모든 매장에 해당하는 할인율
    String storeName;    //매장명
    int colaPrice;       //콜라가격
    int coffeePrice;     //커피가격

    //매장마다 할인율을 다르게 하기 위해 생성자를 생성함.
    Store(String name,int colaprice,int coffeeprice){
        this.storeName = name;
        this.colaPrice = colaprice;
        this.coffeePrice = coffeeprice;
    }
    void ShowInfo(){
        System.out.println("-----------------"+storeName+"-------------------");//지점명명
       System.out.println("커피 가격 : " + (coffeePrice*(1-sales)));           //매장당 커피 할인율
        System.out.println("콜라 가격 : " + (colaPrice*(1-sales)));             //매장당 콜라 할인율
    }
}


public class C03StaticMain {

    public static void main(String[] args) {
        // 1 편의점 공통 할인율 ( 할인율 = static )
        Store.sales = 0.15;
        Store GS감삼점 = new Store("GS감삼",1000,1000);
        Store GS반월당점 = new Store("GS반월당",2000,2000);
        Store GS동성로점 = new Store("GS동성로",1500,1500);
        GS감삼점.ShowInfo();
        GS동성로점.ShowInfo();
        GS반월당점.ShowInfo();

        // 2 레스토랑 예약하기 ( 예약가능 Room수 - static)

        // 정우균이 00레스토랑에 예약하다
        
    }

}
