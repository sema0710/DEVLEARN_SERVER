package sema.DEVLEARN.payload.request.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class SignUpRequest {
    @Email
    private String email;
    private String name;
    private String password;
}
