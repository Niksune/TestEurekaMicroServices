package net.niksune.MainEurekaClient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private String name;

}