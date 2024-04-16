package toyProject.toy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue  //시퀀스 값 쓰기위해
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded //내장타입이기에 설정
    private Address street;

    @OneToMany(mappedBy = "member") //멤버의 입장에서는 오더와 일대다 관계 여기다 값을 넣는다고 해도 포링키 값이 변경되지않음
    private List<Order> orders = new ArrayList<>();
}
