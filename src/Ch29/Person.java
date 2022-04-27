package Ch29;

public class Person implements Service{
    String name; //회원명
    String phone; //휴대폰번호

    //등록
    public void Insert(){
        System.out.println("회원 가입");
    }
    //수정
    public void Update(){
        System.out.println("회원 수정");
    }

    //조회
    public void inquiry(){
        System.out.println("회원조회");
    }
    //삭제
    public void Delete(){
        System.out.println("회원 삭제");
    }
}
