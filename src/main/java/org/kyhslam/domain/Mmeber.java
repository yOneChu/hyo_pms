package org.kyhslam.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
@Table(name = "voc_member")
public class Mmeber {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;


}
