package com.example.oauthJWT.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

@RequiredArgsConstructor
public class CustomOAuth2User implements OAuth2User {

    private final UserDto userDto;

    @Override
    public Map<String, Object> getAttributes() {
        return Map.of();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new ArrayList<>();
        collection.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return userDto.getRole();
            }
        });
        return collection;
    }

    @Override
    public String getName() {
        return userDto.getName();
    }

    public String getUsername() {
        return userDto.getUsername();
    }

}
