package com.xworkz.userapp.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="user_details")
@NamedQuery(name="getAllUsers" , query = "from UserEntity entities")
@NamedQuery(name="deleteUser" , query = "delete from UserEntity entity where entity.id=:id")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private Long phoneNumber;
}
