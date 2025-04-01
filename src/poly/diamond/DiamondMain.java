package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        //인터페이스는 인스턴스로 구현 불가
//        InterfaceA a = new InterfaceA();
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
