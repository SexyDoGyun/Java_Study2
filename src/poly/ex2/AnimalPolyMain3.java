package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            sountAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void sountAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
