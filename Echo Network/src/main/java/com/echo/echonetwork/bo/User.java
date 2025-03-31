package com.echo.echonetwork.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user_network") // Can't naming table by "user" because reserved by PostgreSQL
@Data
@SuperBuilder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private int age;
}
