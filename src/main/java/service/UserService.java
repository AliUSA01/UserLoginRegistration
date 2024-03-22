package service;

import Repository.UserRepository;
import dto.UserRegisterDto;
import entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {


    private final ModelMapper modelMapper;

    private final UserRepository userRepository;
    public void register(UserRegisterDto userRegisterDto){
        User user = modelMapper.map(userRegisterDto, User.class);

        if(!user.getPassword().equals(user.getRepeatPassword())){
            throw new RuntimeException("Please repeat password correctly..");
        }

        if(userRepository.existsByMail(userRegisterDto.getEmail())) {

            throw new RuntimeException("Email already exist..");
        }

        userRepository.save(user);



    }



}
