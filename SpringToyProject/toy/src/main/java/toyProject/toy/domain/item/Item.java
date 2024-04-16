package toyProject.toy.domain.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //한 테이블에 다 때려박는 싱글 테이블 전략
@DiscriminatorColumn(name = "dtype") //싱글테이블 전략이기에 어떻게 읽을것인지에 대한 설정
@Getter @Setter
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

    // private List<Category> categories = new ArrayList<>();
}
