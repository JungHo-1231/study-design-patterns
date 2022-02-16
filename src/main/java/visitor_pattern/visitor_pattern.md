참고 : https://thecodinglog.github.io/design/2019/10/29/visitor-pattern.html

# Visitor Pattern

### 언제 사용해야 하나?

적용해야 할 대상 객체가 잘 바뀌지 않고 (특히 개수) 적용할 알고리즘이 추가될 가능성이 많은 상황일 때 사용을 고려해야 한다. 다시 말하면 Member 등급은 Gold, Vip, Green 으로 고정이거나 추가될
가능성이 작으면서 혜택은 앞으로 계속해서 추가될 가능성이 있을 때를 말한다. 왜냐하면 Memebr 가 추가되면 모든 Benefit 클래스를 수정해야 하기 때문이다.

또한 대상 객체가 가지는 동작과 객체를 분리해 코드의 응집도를 높이고자 할 때 사용할 수 있다. 멤버별 혜택에 대한 로직을 보기 위해서는 Benefit의 구상 클래스만 보면 쉽게 파악할 수 있다.

### Visitor

Element 를 방문하고 동작을 구현하기 위한 인터페이스이다. 위 예제는 Benefit 인터페이스가 그 역할을 한다.

### Concrete Visitor

실제 알고리즘을 가지고 있는 구현체이다. 위 예제에서는 PointBenefit, DiscountBenefit 이 그 역할이다.

### Element

구조를 구성하는 인터페이스이자 Visitor 가 방문하여 수행해야 할 대상이다. Visitor 를 실행할 수 있는 메소드를 하나 가지고 있으며 보통 accept 라는 이름으로 정의한다.

위 예제에서는 Member 가 그 역할을 하고 getBenefit 메서드가 accept 역할을 한다.

### ConcreteElement

Element 의 실 구현체이다. 위 예제에서는 VipMember, GoldMember 가 그 역할을 한다.

### ObjectStructure

Element 를 가지고 있는 객체 구조이다. 위 예제에서는 특별히 구조를 사용하지 않았다. 보통 Set, List, CompositeComponent 가 그 역할을 한다.