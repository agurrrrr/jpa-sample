package kr.devbox.jpasample.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.io.Serializable;


@Entity
@Getter
@Setter
public class Office implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long officeId;

    @Comment("사무실 명")
    private String officeName;

    @Comment("주소")
    private String address;

    @ManyToOne
    @JoinColumn(name = "companyId", nullable = false)
    private Company company;


}
