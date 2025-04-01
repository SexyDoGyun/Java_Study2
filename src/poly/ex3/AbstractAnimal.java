package poly.ex3;

//추상클래스 선언
public abstract class AbstractAnimal {
    public abstract void sound(); //추상 메서드가 하나라도 있으면, 클래스도 추상 클래스로 선언해야 한다.
    //추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다. 그래서 메서드 바디 부분이 없다. 바디부분 만들면 컴파일 오류

    public abstract void move();
//    {
//        System.out.println("동물이 움직입니다.");
//    }
}
