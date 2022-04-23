package Ch21.Employee;
public class Employee {
    String name;
    String addr;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    Employee(String name, String addr,String phone){
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }

    void ShowBasicInfo(){
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("연락처 : " + phone);
    }

}
