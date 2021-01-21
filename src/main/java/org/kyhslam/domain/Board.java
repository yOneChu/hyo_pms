package org.kyhslam.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

//게시판 내용
@Entity
@Setter
@Getter
@Table(name="voc_board")
public class Board {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private LocalDateTime startDate; //문제 발생일

    private LocalDateTime requireDate; //요청날짜

    private String yProblem; //문제점 현상

    private String pCause; //E3PS원인

    private String processStatus; //E3PS처리상태

    private LocalDateTime compDate; // 완료예정일

    private String yStatus; //완료여부
}
