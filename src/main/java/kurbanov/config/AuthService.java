package kurbanov.config;


import kurbanov.dto.requests.AuthRequest;
import kurbanov.dto.responses.UserResponseWithToken;
import kurbanov.exception.NotFoundException;
import kurbanov.models.User;
import kurbanov.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author Mukhammed Asantegin
 */
@Service
@RequiredArgsConstructor
public class AuthService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final JwtService jwtService;

    public UserResponseWithToken login(AuthRequest authRequest) {
        User user = userRepository.findUserByEmail(authRequest.email()).orElseThrow(() ->
                new NotFoundException(String.format("User with email: %s not found!", authRequest.email())));

        String password = authRequest.password();
        String dbEncodePassword = user.getPassword();

        if (!passwordEncoder.matches(password, dbEncodePassword)) {
            throw new RuntimeException("Invalid password");
        }
        String token = jwtService.createToken(user);

        return new UserResponseWithToken(
                user.getId(),
                user.getEmail(),
                user.getRole(),
                token
        );
    }
}
