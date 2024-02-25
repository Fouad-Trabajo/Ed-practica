package com.dam.app.features.vote_message.domain;

import com.dam.app.features.app_config.domain.AppConfig;
import com.dam.app.features.app_config.domain.AppConfigRepository;

public class VoteMessageUseCase {

    private AppConfigRepository appConfigRepository;

    public VoteMessageUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }


    public boolean execute(){
        AppConfig appConfig= appConfigRepository.getAppConfig();
        return appConfig !=null && appConfig.countOpened==10;
    }
}
