package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다.
//        poly.childMethod(); //컴파일 오류
        poly.parentMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        //Child child = poly
        Child child = (Child) poly; //x001
        child.childMethod();
        child.parentMethod();

        Parent parent = (Parent) child;
        parent.parentMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        //poly.childMethod() 이거는 안된다. 하지만
//        ((Child) poly).childMethod(); 이거는 된다. 연산자 우선순위 때문에 poly.childMethod()이게 먼저 실행되어 괄호를 넣어줘야한다.
        ((Child) poly).childMethod();
    }
}
