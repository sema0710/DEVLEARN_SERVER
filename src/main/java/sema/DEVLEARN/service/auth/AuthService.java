package sema.DEVLEARN.service.auth;

import sema.DEVLEARN.payload.request.auth.AuthRequest;

public interface AuthService {
    void auth(AuthRequest authRequest);
}
