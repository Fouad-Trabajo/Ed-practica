package com.dam.app.features.app_config.domain;

public class IncrementAppOpenedUseCase {

    private AppConfigRepository appConfigRepository;

    public IncrementAppOpenedUseCase(AppConfigRepository appConfigRepository) {
        this.appConfigRepository = appConfigRepository;
    }

    public void execute(){
        AppConfig appConfig = appConfigRepository.getAppConfig();
        if(appConfig==null){
            appConfig= new AppConfig(0);
        }else{
            appConfig = new AppConfig(appConfig.countOpened+1);
        }
        appConfigRepository.saveAppConfig(appConfig);
    }
}
