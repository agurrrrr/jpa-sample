package kr.devbox.jpasample.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.io.Serializable;


@Entity
@Getter
@Setter
public class Worker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workerId;

    @Comment("이름")
    private String name;

    @Comment("휴대폰 번호")
    private String mobile;

    @Comment("회사 ID")
    private Long companyId;


}
