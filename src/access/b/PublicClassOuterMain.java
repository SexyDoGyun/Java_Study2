package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가 why? 패키지 접근 제어자가 default라서 a패키지에서만 접근 가능
        //DefaultClass1 class1 = new DefaultClass1();
        //DefaultClass2 class2 = new DefaultClass2();
    }
}
