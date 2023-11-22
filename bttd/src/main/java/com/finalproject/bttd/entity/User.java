package com.finalproject.bttd.entity;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {

    @Id
    private String user_id;
    @Column(name="user_name")
    private String user_name;
    @Column(name="user_age")
    private String user_age;
    @Column(name="user_weight")
    private String user_weight;
    @Column(name="user_score")
    private String user_score;
    @Column(name="user_password")
    private String user_password;



}
