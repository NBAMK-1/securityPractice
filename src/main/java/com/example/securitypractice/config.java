package com.example.securitypractice;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class config extends WebSecurityConfigurerAdapter {
    //authentication
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    //authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }
}
