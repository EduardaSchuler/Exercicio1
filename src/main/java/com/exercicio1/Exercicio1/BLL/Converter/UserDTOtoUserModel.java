package com.exercicio1.Exercicio1.BLL.Converter;

import com.exercicio1.Exercicio1.BLL.DTO.UserDTO;
import com.exercicio1.Exercicio1.DAO.Model.UserModel;

public class UserDTOtoUserModel {
    public static UserModel converter (UserDTO userDTO){
        return new UserModel(
            userDTO.getId(),
            userDTO.getNome(),
            userDTO.getDataNascimento(),
            userDTO.getNumDependentes());
    }
}
