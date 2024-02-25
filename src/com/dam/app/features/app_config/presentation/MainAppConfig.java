package com.dam.app.features.app_config.presentation;

import com.dam.app.features.app_config.data.AppConfigDataRepository;
import com.dam.app.features.app_config.data.local.FileLocalData;
import com.dam.app.features.app_config.domain.IncrementAppOpenedUseCase;

public class MainAppConfig {

    /**
     * Método que se ejecuta siempre que se abre la aplicación
     */

    public static void appOpened(){
        IncrementAppOpenedUseCase incrementAppOpenedUseCase= new IncrementAppOpenedUseCase(
                new AppConfigDataRepository(new FileLocalData()));
        incrementAppOpenedUseCase.execute();
    }
}
