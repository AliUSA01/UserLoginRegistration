package dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
public class UserRegisterDto {
     String userName;
     String password;
     String repeatPassword;
     String email;
}
