package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "홍길동"; //문자열 변수선언
        int hour = 15; //정수형 변수선언

        System.out.println(name + "님 " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5; //실수 변수선언
        char grade = 'A'; //한 글자 변수를 선언할때 char를 사용한다. (싱글쿼터 사용)
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true; //boolean 타입 변수 선언
        System.out.println("합격은? " + pass);

        double d = 3.14123456789; //double은 소수 14자리까지 정확하게 표헌 가능 나누기를 할 땐 16자리까지 표현
        float f = 3.14123456789f; //float은 소수 5자리 까지 정확하게 표헌 가능 그 이상은 오차가 발생한다.
        //나누기를 할 땐 7자리까지 표현, 기본적으로 실수는 double 자료형이므로 float에 사용하려면 value 뒤에 f를 붙혀줘야 사용가능하다.
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l; //인트가 가질 수 있는 정수 범위는 약 +-21억이다. 이 벙위를 벗어날 경우엔 long 자료형으로 선언해야하며, float과 동일하게 value 뒤에 l을 붙혀줘야 한다.
        l = 1_000_000_000_000l; // 언더바를 사용하여 가독성을 높힐 수 있음.
        System.out.println(l);
    }
}
