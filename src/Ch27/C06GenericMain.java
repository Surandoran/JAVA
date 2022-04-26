package Ch27;
//abstract class PMeterial{
//    public abstract void doPrinting();
//}
//
//class Plastic extends PMeterial{
//    public void doPrinting() {
//        System.out.println("Powder 재료로 출력");
//    }
//}
//class Powder extends PMeterial{
//    public void doPrinting() {
//        System.out.println("Plastic 재료로 출력");
//    }
//}
//class Water{
//    public void doPrinting() {
//        System.out.println("Water 재료로 출력");
//    }
//}
//class ThreeDPrinter<T extends PMeterial>{
//    //- meterial : Generic <T> //제너릭 설정할것, Getter and Setter 함수도 같이 만들어보세요 ~
//    private T meterial;
//
//    public T getMeterial() {
//        return meterial;
//    }
//    public void setMeterial(T meterial) {
//        this.meterial = meterial;
//    }
//
//}
//public class C06GenericMain {
//    public static void main(String[] args) {
//        //정상재료
//        ThreeDPrinter<Powder> print1 = new ThreeDPrinter<Powder>();
//        print1.setMeterial(new Powder());
//        print1.getMeterial().doPrinting();
//        //정상재료
//        ThreeDPrinter<Plastic> print2 = new ThreeDPrinter<Plastic>();
//        print2.setMeterial(new Plastic());
//        print2.getMeterial().doPrinting();
//
//        //비정상재료
//		ThreeDPrinter<Water> print3 = new ThreeDPrinter<Water>();
//		print3.setMeterial(new Water());
//		print3.getMeterial().doPrinting();
//
//    }
//
//}