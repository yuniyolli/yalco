package sec03.chap03;
/*
### char - 문자 *character* 자료형

- 2바이트 사용 - `short`와 동일
- 유니코드상 문자 - 🍿 https://youtu.be/1jo6q4dihoU
- 단따옴표를 사용하여 1개의 문자 표현 - *빈 문자 불가*

문자별 유니코드 정보:  🔗 List of Unicode characters - Wikipedia
 */

public class Ex01 {
    public static void main(String[] args) {
        //  각 문자는 상응하는 정수를 가짐
        char ch1 = 'A';
        System.out.println(ch1);
        char ch2 = 'B';
        char ch3 = 'a';
        char ch4 = 'a' + 1; // 'b' 98
        // 문자(char) != 문자열(String)
        String str = "a" + 1; // a1

        char ch5 = '가';
        char ch6 = '가' + 1;
        char ch7 = '가' + 2;
        char ch8 = '가' + 3;
        char ch9 = '나';

        int ch1Int = (int) ch1;
        int ch9Int = (int) ch9;

        // 문자 리터럴과 숫자, 유니코드로 표현 가능
        char ch10 = 'A';
        char ch11 = 65;
        char ch12 = '\u0041';
    }
}
