package com.example.demo.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name = "TEST")
public class User {

    @Id // 해당 변수가 PK가 됩니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 값이 없어도 자동으로 할당 합니다.
    private Long id;

    @Column(nullable = true) // 테이블의 컬럼 설정 값을 명시할 수 있다.
    private String name;
    
    @Column(name = "EMAIL")
    private String email;


    // 생성자, getter, setter
}