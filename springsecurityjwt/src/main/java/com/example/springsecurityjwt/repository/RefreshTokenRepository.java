package com.example.springsecurityjwt.repository;

import com.example.springsecurityjwt.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    boolean existsByRefresh(String refresh);

    @Transactional
    void deleteByRefresh(String refresh);
}
