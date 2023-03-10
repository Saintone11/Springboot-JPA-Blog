package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // User 클래스가 MySQL에 테이블이 생성이 된다.
//@DynamicInsert // null인 필드 insert 안함
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 30)
	private String username;
	
	@Column(nullable = false, length = 100)
	private String password;
	 
	@Column(nullable=false, length = 50)
	private String email;
	
	//@ColumnDefault("user")
	@Enumerated(EnumType.STRING)
	private RoleType role; // Enum을 쓰는게 좋다. //admin, user, manager
	
	@CreationTimestamp // 시간 자동입력
	private Timestamp createDate;
}  
