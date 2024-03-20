package service;

import dto.UserRegisterDto;
import entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {


    private final ModelMapper modelMapper;

    public UserService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public void register(UserRegisterDto userRegisterDto){
        User user = modelMapper.map(userRegisterDto, User.class);

        if(user.getPassword().equals(user.getRepeatPassword())){

        }
    }



}
