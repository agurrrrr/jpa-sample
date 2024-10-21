package kr.devbox.jpasample.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
public class Company implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(nullable = false)
    @Comment("회사명")
    private String companyName;

    // 단방향 조인
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "companyId")
    List<Worker> workerList;


    // 양방향 조인
    @JsonIgnoreProperties({"company"})
    @OneToMany(mappedBy = "company")
    List<Office> officeList;



}
