package com.evol.provider.model.api;


import org.springframework.web.bind.annotation.PostMapping;

public interface UscUserTokenApi {

    //Wrapper<Integer> updateTokenOffLine();

    @PostMapping("/api/usc/token/updateTokenOffLine")
    Integer updateTokenOffLine();

}
