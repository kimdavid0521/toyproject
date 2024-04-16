package toyProject.toy.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable //내장 타입이기에 설정
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
