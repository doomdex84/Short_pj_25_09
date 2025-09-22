package com.koreait.short_pj_25_09.domain.article.article.entity;

import com.koreait.short_pj_25_09.domain.member.member.entity.Member;
import com.koreait.short_pj_25_09.global.jpa.entity.BaseTime;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Article extends BaseTime {

    private String title;
    @Column(columnDefinition = "TEXT")
    private String body;

    @ManyToOne
    private Member author;
}