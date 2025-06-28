package com.example.auth.repository.Entity;

import com.example.auth.repository.Enum.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.PrivateKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Indexed
    private Long user_id;

    private String userName;
    private String email;
    private String password;

    private Role role;
}