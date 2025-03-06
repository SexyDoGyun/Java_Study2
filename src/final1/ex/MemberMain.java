package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();

        Member changeData = new Member("myId2", "kim");
        member.print();

    }
}
