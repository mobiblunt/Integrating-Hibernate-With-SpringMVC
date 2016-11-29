/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payroll.security;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Autowired
    DataSource datasource;
    
    @Autowired
        public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
	auth.jdbcAuthentication().datasource(datasource)
	.usersByUsernameQuery("select first_name,last_name, from user where first_name=?")
	.authoritiesByUsernameQuery("select first_name, role from user_roles where first_name=?");
}
    
@Override
protected void configure(HttpSecurity http) throws Exception {
http
.authorizeRequests()
.antMatchers("/messageList*").hasAnyRole("USER", "ANONYMOUS")
.antMatchers("/messagePost*").hasRole("USER")
.antMatchers("/messageDelete*").hasRole("ADMIM")
.and()
.formLogin();
}
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
auth.inMemoryAuthentication()
.withUser("admin").password("secret").authorities("ROLE_ADMIN","ROLE_USER")
.and().withUser("user1").password("1111").authorities("ROLE_USER");
}
}

