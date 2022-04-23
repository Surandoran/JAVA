package Ch21.Employee;

public class Main {

    public static void main(String[] args) {

        Reguler re = new Reguler("손필욱","중구","010-2088-3028",4000,"과장","프론트엔드");
        Temporary te = new Temporary("필욱손","중구","010-2222-3333",15000,8,12);

        System.out.println("============Employee호출===========");
        re.ShowBasicInfo();
        te.ShowBasicInfo();
        System.out.println("============Reguler호출============");
        re.ShowRegInfo();
        System.out.println("============Temporary호출============");
        te.ShowTempinfo();

    }

}
