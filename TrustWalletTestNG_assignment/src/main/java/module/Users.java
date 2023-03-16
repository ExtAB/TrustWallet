package module;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
    long id;
    String name;
    String password;
    String phrase;
}
