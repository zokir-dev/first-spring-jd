package com.cyber.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mentor {

    private String firstName;
    private String lastName ;
    private String email;
    private boolean graduated;
    private String gender;
    private String batch;
    private String company;

}
