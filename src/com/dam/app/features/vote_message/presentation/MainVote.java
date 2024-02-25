package com.dam.app.features.vote_message.presentation;

import com.dam.app.features.app_config.data.AppConfigDataRepository;
import com.dam.app.features.app_config.data.local.FileLocalData;
import com.dam.app.features.vote_message.domain.VoteMessageUseCase;

public class MainVote {
    public static void voteMessage(){
        VoteMessageUseCase voteMessageUseCase= new VoteMessageUseCase(
                new AppConfigDataRepository(new FileLocalData()));
        boolean voteApp= voteMessageUseCase.execute();
        if(voteApp){
            System.out.println("Por favor votanos");
        }
    }
}
