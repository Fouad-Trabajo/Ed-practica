package com.dam.app.features.first_message.domain;

import com.dam.app.features.app_config.domain.AppConfig;
import com.dam.app.features.app_config.domain.AppConfigRepository;

public class WelcomeMessageUseCase {

    //Atributo de repositorio
    private AppConfigRepository appConfigRepository;


    //Constructor
    public WelcomeMessageUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }


    //Método ejecutar
    public boolean execute() {
        AppConfig appConfig = appConfigRepository.getAppConfig();
        return appConfig != null && appConfig.countOpened == 0;
    }
}
