package Ch21.Computer;

public class Main {
    public static void main(String[] args) {

        NoteBook MyLgGram = new NoteBook("1-2-3-4","I7","16G","1T",100);

        MyLgGram.Showinfo();
        MyLgGram.PowerON();
        MyLgGram.Move();
        MyLgGram.PowerOFF();
    }
}
