package com.dam.app.features.first_message.presentation;

import com.dam.app.features.app_config.data.AppConfigDataRepository;
import com.dam.app.features.app_config.data.local.FileLocalData;
import com.dam.app.features.first_message.domain.WelcomeMessageUseCase;

public class MainMessage {

    public static void showWelcomeMessage(){
        WelcomeMessageUseCase welcomeMessageUseCase= new WelcomeMessageUseCase(
                new AppConfigDataRepository(new FileLocalData()));
        boolean isFirstTime= welcomeMessageUseCase.execute();
        if(isFirstTime){
            System.out.println("Bienvenido a la aplicaión");
        }
    }
}
