package com.exercicio1.Exercicio1.WebAPP.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exercicio1.Exercicio1.BLL.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService; // supondo que já exista listarTodos()

    // @GetMapping
    // public List<UserDTO> listarTodos() {
    //     return userService.listarTodos();
    // }
}

