package entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Table(name = "users")
@Entity
@FieldDefaults(level=AccessLevel.PRIVATE)
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer id;
     String userName;
     String password;
     String repeatPassword;
     String email;
}
