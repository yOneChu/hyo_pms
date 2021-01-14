package org.kyhslam.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

//게시판 내용
//@Entity
@Setter
@Getter
@Table(name="voc_border")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String state; //완료여부

    @Enumerated(EnumType.STRING)
    private Severity severity; //심각도

    private String issue; //이슈

    private String desc; //문제점 현상

    private LocalDateTime startDate; //발생일

    private LocalDateTime requireDate; //요청날짜

    private String cause; //원인

    private String causeResult;

    private String compnayA; // E3PS처리상태

    private String company_answer; //E3PS처리상태

}
