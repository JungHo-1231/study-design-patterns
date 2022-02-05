# Head First Design Patterns

### 객체지향 원칙

1. 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.
2. 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
3. 상속보다는 구성을 활용한다.
4. 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
5. 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다. (OCP - Open-Closed Principle)
6. 추상화된 것에 의존하도록 만들어라. 구상 클래스에 의존하도록 만들지 않도록 한다.
7. 최소 지식 원칙(=Law of Demeter(데메테르의 법칙) - 정말 친한 친구하고만 얘기해라.(결합을 최대한 적게 하기 위함)
8. 헐리우드의 원칙 - "먼저 연락하지 마세요, 저희가 연락 드리겠습니다." - 어떤 고수준 구성요소가 저수준 구성요소에 의존하고, 그 저수준 구성요소는 다시 고수준 구성요소에 의존하고 하는 식으로 의존성이
   복잡하게 꼬여있는 상태인 의존성 부패(dependency rot)를 방지할 수 있다.
9. 어떤 클래스가 바뀌게 되는 이유는 한 가지 뿐이어야 한다.

### 디자인 패턴

[옵저버 패턴](src/main/java/chapter02/chpater02_정리.md)

[데코레이터 패턴](src/main/java/chapter03/chpater03_정리.md)

[팩토리 패턴](src/main/java/chapter04/chpater04_정리.md)

[커멘드 패턴](src/main/java/chapter06/chpater06_정리.md)

[어댑터 패턴 && 파사드 패턴](src/main/java/chapter07/chpater07_정리.md)
