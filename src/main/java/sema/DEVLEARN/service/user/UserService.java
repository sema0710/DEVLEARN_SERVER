package sema.DEVLEARN.service.user;

import sema.DEVLEARN.payload.request.user.SignUpRequest;

public interface UserService {
    void signUp(SignUpRequest signUpRequest);
}
