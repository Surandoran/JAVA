package Ch21.Employee;

import Ch21.Employee.Employee;

public class Reguler extends Employee {
    private int salary; //연봉
    private String title; //직책
    String depart;      //부서

    Reguler(String name,String addr,String phone,int salary,String title,String depart){
        super(name,addr,phone);
        this.salary = salary;
        this.title = title;
        this.depart = depart;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    void ShowRegInfo(){
        ShowBasicInfo();
        System.out.println("연봉 = " + salary);
        System.out.println("직책 = " + title);
        System.out.println("부서 = " + depart);
    }
}
