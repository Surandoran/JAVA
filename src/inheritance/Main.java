package inheritance;
public class myTV{

    private int size;

    public void TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }

public class Main {
    ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
        }
//        32인치 1024컬러
}
