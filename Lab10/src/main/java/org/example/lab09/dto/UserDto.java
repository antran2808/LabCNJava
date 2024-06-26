package org.example.lab09.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class UserDto {

    private Long id;

    private String username;

    private String password;

    public UserDto(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}