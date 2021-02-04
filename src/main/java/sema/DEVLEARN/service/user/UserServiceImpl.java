package sema.DEVLEARN.service.user;

import lombok.RequiredArgsConstructor;
import sema.DEVLEARN.entities.user.User;
import sema.DEVLEARN.entities.user.repository.UserRepository;
import sema.DEVLEARN.payload.request.user.SignUpRequest;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public void signUp(SignUpRequest signUpRequest) {
        userRepository.findByEmail(signUpRequest.getEmail()).ifPresent((user) -> {});
        userRepository.findByName(signUpRequest.getName()).ifPresent((user) -> {});
        userRepository.save(
                User.builder()
                        .email(signUpRequest.getEmail())
                        .name(signUpRequest.getName())
                        .password(signUpRequest.getPassword())
                        .build()
        );
    }
}
