package sec03.chap01;
// 연산자 (= : 대입연산자)
public class Ex03 {
    public static void main(String[] args) {

        int a = 1 + 2;
        int b = a - 1;
        int c = b * a;
        int d = a + b * c / 3;
        int e = (a + b) * c / 3;
        int f = e % 4;
        // return (반환) : 바꿔쓸 수 있다 는 의미
        // 부수효과가 없음. a의 값을 사용해도 변하지 않음
    }

}
