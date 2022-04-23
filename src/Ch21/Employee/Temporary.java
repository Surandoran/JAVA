package Ch21.Employee;

import Ch21.Employee.Employee;

public class Temporary extends Employee {

    private int perPayment; //시급
    private int workingHour; //근로시간
    private int wokingDay;  //근무일수

    Temporary(String name,String addr,String phone,int pay,int hour,int day){
    super(name,addr,phone);
    perPayment = pay;
    workingHour = hour;
    wokingDay = day;
    }

    public int getPerPayment() {
        return perPayment;
    }

    public void setPerPayment(int perPayment) {
        this.perPayment = perPayment;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getWokingDay() {
        return wokingDay;
    }

    public void setWokingDay(int wokingDay) {
        this.wokingDay = wokingDay;
    }

    void ShowTempinfo(){
        ShowBasicInfo();
        System.out.println("시급 = " + perPayment);
        System.out.println("근무시간 = " + workingHour);
        System.out.println("근무일자 = " + wokingDay);
    }



}
