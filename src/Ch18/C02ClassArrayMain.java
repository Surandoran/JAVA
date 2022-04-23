package Ch18;

import java.util.Scanner;

class Book{
    String Bookcode;
    String Bookname;
    String publisher;
    String Amount;


    public Book(String bookcode, String bookname, String publisher, String amount) {
        Bookcode = bookcode;
        Bookname = bookname;
        this.publisher = publisher;
        Amount = amount;
    }


}

public class C02ClassArrayMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Book BookList[]=null;
        int num = 0;
        int count=0;
        while (true) {
            System.out.println("---------BookStore-----------");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 전체 도서 확인");
            System.out.println("4. 종료");
            System.out.println("---------BookStore-----------");
            System.out.print("번호 : ");
            //1.도서 등록
            //2.도서 검색
            //3.전체 도서 확인
            //4.종료
            num= input.nextInt();

            switch(num) {
                //1도서등록시 들어가는 케이스
                case 1:
                    //처음 도서 등록 1번을 누르면 보게되는 화면
                    System.out.print("몇권을 등록하나요??>>> ");
                    //몇권을 등록할건지 묻는것임. 정수형으로 입력
                    count = input.nextInt();
                    //책의 권수는 count 이므로 같음
                    BookList= new Book[count];
                    //for문을 이용해 권수만큼 반복 즉 등록할 코드와 제목 저자 가격을 권수만큼 반복
                    for (int i = 0; i < count; i++) {
                        System.out.println("등록할 도서를 입력 하세요>>>>(코드, 제목, 저자, 가격)");
                        String Bookcode = input.next(); //코드
                        String Bookname = input.next(); //제목
                        String publisher = input.next();//저자
                        String Amount = input.next();   // 가격
                        //생성자
                        BookList[i] = new Book(Bookcode, Bookname, publisher, Amount);
                    }
                    break;
                //2. 도서 검색시 들어가는 케이스
                case 2:
                    //위에서 count 한 권수 만큼 나옴.
                    System.out.println("현재 도서는 = " + BookList.length + "권 입니다.");
                    System.out.print("검색할 도서를 입력하세요 >>>>");
                    //case1 에서 등록한 권수의 이름을 적어야함.
                    String name = input.next();

                    System.out.println(BookList[0].Bookname);
                    for (int i = 0; i < BookList.length ; i++) {
                        if (BookList[i].Bookname.contains(name)) {
                            System.out.printf("%s %s %s %s \n",BookList[i].Bookcode,BookList[i].Bookname,BookList[i].publisher,BookList[i].Amount);
                            break;
                        }else {
                            System.out.println("존재하지 않는 책입니다.");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < BookList.length; i++) {
                        System.out.printf("책 코드 : %s  책 제목 : %s  책 저자 : %s 책 가격: %s\n",BookList[i].Bookcode,BookList[i].Bookname,BookList[i].publisher,BookList[i].Amount);
                    }
                    break;
                case 4:
                    System.exit(-1);
                    break;
            }


        }
    }

}
