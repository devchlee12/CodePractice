package springpractice.springjwt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import springpractice.springjwt.domain.UserEntity;
import springpractice.springjwt.dto.JoinDto;
import springpractice.springjwt.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void joinProcess(JoinDto joinDto){
        String username = joinDto.getUsername();
        String password = joinDto.getPassword();

        boolean isExist = userRepository.existsByUsername(username);
        if (isExist)
            return;

        UserEntity userEntity = new UserEntity(username,bCryptPasswordEncoder.encode(password),"ROLE_ADMIN");
        userRepository.save(userEntity);
    }
}
