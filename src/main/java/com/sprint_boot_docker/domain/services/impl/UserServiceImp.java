package com.sprint_boot_docker.domain.services.impl;

import org.springframework.beans.factory.annotation.Value;
import com.sprint_boot_docker.domain.dtos.request.UserRequest;
import com.sprint_boot_docker.domain.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImp implements UserService {

    /*****************************************************
        Seudo Variable de Entorno, ya Spring lo toma como una
        Propiedad mas no como un ENV
     ******************************************************/
    @Value("${app.autor}")
    private String autor;

    /************************************************************
        Variable de entorno (ENV) ya que si busca una variable
        desde el sistema o servideor, Pasos
        1 .- Run → Edit Configurations
        2 .- Selecciona tu app
        3 .- En "Environment variables" agrega
    **************************************************************/
    //Opcion 1
    // String appPass = System.getenv("APP_PASS");

    //Opcion 2
    @Value("${APP_PASS}")
    private String appPass;

    public UserRequest getUser() {
        UserRequest user = new UserRequest(autor, appPass, "ADMIN-GCP");
        return user;
    }
}
