package com.dam.app.features.app_config.domain;

public interface AppConfigRepository {
    AppConfig getAppConfig(); //Método de obtener

    void saveAppConfig(AppConfig appConfig); //Método de guardar
}
