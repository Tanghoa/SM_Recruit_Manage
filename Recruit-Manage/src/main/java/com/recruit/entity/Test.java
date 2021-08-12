package com.recruit.entity;

import lombok.*;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Test implements Serializable {


    private Integer id;
    private String username;
    private String password;

    public static void main(String[] args) {
        Test test = new Test();


    }






}
