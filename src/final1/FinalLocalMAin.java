package final1;

public class FinalLocalMAin {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
        method(10);
    }

    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류 why? 위의 메서드를 호출할때 parameter에 10을 넣어줬기 때문에
    }
}
