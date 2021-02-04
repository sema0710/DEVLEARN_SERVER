package sema.DEVLEARN.payload.response.user;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponse {
    private Integer Id;
    private String name;
    private String email;
    private Boolean isAdmin;
}
