package poly.diamond;

//인터페이스는 다중 구현이 가능하다
public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }


    //methodCommon() 메서드가 InterfaceA, InterfaceB에 둘 다 있지만, 인터페이스에서는 구현을 하지 않기 때문에 하나만 구현하면 된다.
    //다이아몬드 문제 해결
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
