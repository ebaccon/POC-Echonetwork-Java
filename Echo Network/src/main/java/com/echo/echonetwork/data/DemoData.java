package com.echo.echonetwork.data;

import com.echo.echonetwork.bo.User;
import com.echo.echonetwork.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class DemoData {

    @Autowired
    private UserRespository userRespository;
    @Autowired
    private RestClient.Builder builder;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        User userToSave1 = User.builder()
                .firstName("Erwan")
                .lastName("Baccon")
                .age(34)
                .email("ebaccon@toto.fr")
                .build();
        userRespository.save(userToSave1);

        User userToSave2 = User.builder()
                .firstName("Erwan")
                .lastName("Baccon2")
                .age(32)
                .email("ebaccon@titi.fr")
                .build();
        userRespository.save(userToSave2);

        User userToSave3 = User.builder()
                .firstName("John")
                .lastName("Doe")
                .age(40)
                .email("j.doe@tutu.fr")
                .build();
        userRespository.save(userToSave3);

        User userToSave4 = User.builder()
                .firstName("Haglae")
                .lastName("Baccon")
                .age(13)
                .email("h.baccon@tata.fr")
                .build();
        userRespository.save(userToSave4);

        User userToSave5 = User.builder()
                .firstName("Romain")
                .lastName("Poe")
                .age(32)
                .email("r.poe@titi.fr")
                .build();
        userRespository.save(userToSave5);
    }
}
