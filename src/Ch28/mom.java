package Ch28;
class Father{

    public String why(){

        return "왜 불러";

    }

}
public class mom{

    public static void main(String[] args){

        Father f = new Father();

        System.out.println(f.why());

    }

}
