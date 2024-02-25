package com.dam.app.features;

import com.dam.app.features.app_config.presentation.MainAppConfig;
import com.dam.app.features.first_message.presentation.MainMessage;
import com.dam.app.features.vote_message.presentation.MainVote;

public class MainApp {
    public static void main(String[] args) {


        //AppConfig: Configuración de la aplicación
        MainAppConfig.appOpened();

        //Mensaje de bienvenida
        MainMessage.showWelcomeMessage();

        //Mensaje de votación
        MainVote.voteMessage();
    }
}