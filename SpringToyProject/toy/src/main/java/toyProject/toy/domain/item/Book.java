package toyProject.toy.domain.item;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@DiscriminatorValue("B") //싱글 테이블이기에 저장해둘때 구분할게 필요함
@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;
}
