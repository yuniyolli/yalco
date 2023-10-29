package sec03.chap04;

public class Ex01 {
    public static void main(String[] args) {
        // 왜 boolean은 참/거짓 2 bit가 아니라 1byte (8bit)?
        // 컴퓨터가 메모리상에서 잡을 수 있는 가장 작은 단위가 1바이트이기(8비트) 때문
        boolean bool1 = true;
        boolean boot2 = false;


        boolean bool3 = !true; // false
        boolean bool4 = !false; // true

        boolean bool5 = !!bool3; // false
        boolean bool6 = !!!bool3; // true



        boolean bool7 = !(1 > 2); // true
        boolean bool8 = !((5 / 2) == 2.5); // false 땡, true : 5 / 2 는 정수 -> 2 != 2.5
        // 실수로 받고 싶으면 소수점까지 표기
        boolean bool88 = !((5 / 2.0) == 2.5);
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B')); // true

    }
}
