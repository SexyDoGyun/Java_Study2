package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
       // super() //ClassB가 기본생성자일때에만 생략 가능
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
