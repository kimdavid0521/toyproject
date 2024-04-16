package toyProject.toy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne //오더의 입장에서는 멤버와 다대일 관계 (하나의 회원이 여러 주문을 생성할 수 있음)
    @JoinColumn(name = "member_id") //매핑을 무엇으로할거냐? 아까 멤버에 지정해준 컬럼 네임
    private Member member;

    private List<OrderItem> orderItems = new ArrayList<>();

    private Delivery delivery;

    private LocalDateTime orderDate; //따로 내장되어있는 객체

    private OrderStatus orderStatus; //주문의 상태이고 enum타입으로 만들며 상태는 [ORDER, CANCLE] 두개 만들거임.

}
