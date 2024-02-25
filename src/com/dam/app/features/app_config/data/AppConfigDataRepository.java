package com.dam.app.features.app_config.data;

import com.dam.app.features.app_config.data.local.FileLocalData;
import com.dam.app.features.app_config.domain.AppConfig;
import com.dam.app.features.app_config.domain.AppConfigRepository;

public class AppConfigDataRepository implements AppConfigRepository {

    //Atributo del fichero
    private FileLocalData fileLocalData;

    //Constructor del fichero
    public AppConfigDataRepository(FileLocalData fileLocalData) {
        this.fileLocalData = fileLocalData;
    }

    @Override
    public AppConfig getAppConfig() {
        return fileLocalData.incrementCount();
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }


}
