package org.example.auntifucationspring.Model;


import lombok.Data;

@Data
public class SigninRequest {
    private String username;
    private String email;
    private String password;

}
