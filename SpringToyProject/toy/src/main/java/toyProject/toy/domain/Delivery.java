package toyProject.toy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery") //하나의 주문정보는 하나의 배송정보만 가지기에 one to one으로 해야함
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) //defalut값이 ordinary인데 이건 1이 ready, 2가 comp이런식으로 생성되는데 나중에 수정시 값이 다 밀려서 xxx로 나오기때문에
    // 반드시 string으로 설정을 해줘야함
    private DeliveryStatus deliveryStatus;

}
