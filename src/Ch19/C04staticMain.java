package Ch19;
//손님
class Client{
    String name;            //손님명
    String phone;           //손님전화번호
    Client(String name,String phone){
        this.name = name;
        this.phone = phone;
    }
}
//레스토랑
class Restorant{
    String Storename;            //매장명
    int roomcnt;                 //지점 room개수
    static int totalroomcnt;     //전체 room개수
    Client list[];              //예약 손님 정보 저장용 배열참조변수
    int idx;                    //list 배열에 저장될 객체 위치

    Restorant(String name,int roomcnt){ //호텔명, 호텔방
        Storename = name;           //지점명 저장
        this.roomcnt += roomcnt;    //방개수저장
        totalroomcnt += roomcnt;    //전체 방개수 누적
        list = new Client[roomcnt]; //예약손님정보 저장용 배열
        idx = 0;
    }

    void SetReserve(Client client){ //클래스 Client 를 참조하는 client 참조변수 생성 후 main에서 생성자 생성시 이곳으로 저장함

        if(roomcnt != 0){
            roomcnt--;//roomcnt-- (0인경우)
            totalroomcnt--;//totalroomcnt--
            list[idx] = client;//배열참조변수에 client 객체 연결
            idx++;//다음위치로 이동
        }
        //잔여 roomcnt 수 부족
        else {
            System.out.println("예약이 꽉차서 예약이 불가능합니다..");
        }
    }
    void ShowClientInfo(){
        System.out.println("===================================");
        System.out.println("지점명 : " + Storename);
        for(int i = 0; i < idx; i++){
            System.out.printf("%d , %s , : %s\n",(i+1),list[i].name,list[i].phone);
        }
        System.out.println("===================================");
    }
    
    void Showinfo(){
        System.out.println("================================");
        System.out.println("지점명 : " + Storename);
        System.out.println("지점 잔여 Room : " + roomcnt);
        System.out.println("전체 잔여 Room : " + totalroomcnt);
        System.out.println("================================");
        System.out.println();
    }
}

public class C04staticMain {

    public static void main(String[] args) {
        Restorant 서가앤쿡반월당 = new Restorant("반월당점",10);//Storename,roomcnt
        서가앤쿡반월당.SetReserve(new Client("손필욱", "01020883028"));
        서가앤쿡반월당.SetReserve(new Client("손필욱2","01020883028"));
        서가앤쿡반월당.SetReserve(new Client("손필욱3","01020883028"));

        서가앤쿡반월당.Showinfo();
        서가앤쿡반월당.ShowClientInfo();

        Restorant 서가앤쿡감삼점 = new Restorant("감삼점",5);//Storename,roomcnt
        서가앤쿡감삼점.SetReserve(new Client("홍길동", " 010-222-3333"));
        서가앤쿡감삼점.SetReserve(new Client("홍길동2", " 010-222-3333"));
        서가앤쿡감삼점.SetReserve(new Client("홍길동3", " 010-222-3333"));
        서가앤쿡감삼점.SetReserve(new Client("홍길동4", " 010-222-3333"));
        서가앤쿡감삼점.Showinfo();
        서가앤쿡감삼점.ShowClientInfo();

    }

}
