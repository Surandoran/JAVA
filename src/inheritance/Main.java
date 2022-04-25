package inheritance;
class myTV {

    private int size;

    public myTV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV extends myTV {
    public int color;

    public ColorTV(int size,int color){
        super(size);
        this.color = color;
    }

    void printProperty(){
        System.out.println(this.getSize() + "인치" + color + "컬러");
    }
}

class IPTV extends ColorTV{
    String ip;

    public IPTV(String ip,int size,int color){
        super(size,color);
        this.ip = ip;

    }
    @Override
    void printProperty(){
        System.out.println("나의 IPTV는 " + ip + " 주소의 " + this.getSize() + "인치" + color + "컬러");
    }
}
public class Main {
    public static void main(String[] args) {

        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();

        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
        iptv.printProperty();
        //나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
    }
}
