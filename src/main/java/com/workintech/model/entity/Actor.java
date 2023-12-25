package com.workintech.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "actor",schema = "workintech")

public class Actor {
    @GeneratedValue
    @Id
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    Gender gender;
    @Column(name = "birth_day")
    private String birthDay;
    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "movie_actor",schema = "workintech",joinColumns = @JoinColumn(name = "actor_id"),
    inverseJoinColumns=@JoinColumn(name = "movie_id"))
    private List<Actor> actor;

}
