package question.question16;

//Box 클래스와 Macaron 클래스를 설계하시오.
//조건
//Box 객체의 정보
// - 1Box에는 10개의 마카롱을 담을 수 있다. (멤버 변수 = Macaron 배열)
//Box 객체의 사용
// - Box 객체를 생성시 Box에 마카롱 객체를 10개 담는다.(무작위)
// - 품질 검사에 통과하지 못하는 마카롱을 구분한다.
//Macaron 객체의 정보
// - 생산 크기(5cm ~ 15cm) -> 판매 유효 크기(8cm ~ 14cm)
// - 생산 생상(red, blue, yellow, white, pink, purple, green, black) -> 판매 유효 색상(black을 제외한 모든 색상)
// - 생산 샌드 두께(1mm ~ 20mm) -> 판매 유효 두께(3mm ~ 18mm)
public class Test01 {

    public static void main(String[] args) {

        Box box1 = new Box();
        box1.cook();
        box1.check();
        box1.list();

    }
}
