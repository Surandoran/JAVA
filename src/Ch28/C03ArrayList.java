package Ch28;

import java.util.ArrayList;
import java.util.List;

class Profile{
    String name;
    String addr;
    String phone;
    //모든 필드 받는 생성자 만드세요
    public Profile(String name,String addr,String phone){
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }
    //toString 재정의 하세요

    @Override
    public String toString() {
        return "이름은 : " + name + '\n' + "주소는 : " + addr + '\n' + "번호는 : " + phone + '\n';
    }
}

public class C03ArrayList {

    public static void main(String[] args) {
        List<Profile> list = new ArrayList<>();

        //리스트에 Profile객체 추가
        list.add(new Profile("홍길동","대구","010-222-3333"));
        list.add(new Profile("정우균","서울","010-333-4444"));
        list.add(new Profile("이태수","울산","010-555-6666"));

        //리스트 전체 조회
        for (Profile tmp : list) {
            System.out.println(tmp.toString());
        }


    }

}
