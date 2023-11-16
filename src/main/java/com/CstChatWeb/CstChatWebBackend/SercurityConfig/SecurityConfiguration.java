package com.CstChatWeb.CstChatWebBackend.SercurityConfig;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration auth) throws  Exception{
		return auth.getAuthenticationManager();
	}

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http
						.csrf(csrf -> csrf.disable())
						.exceptionHandling(exception -> exception.authenticationEntryPoint())
						.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
						.authorizeHttpRequests(
										request -> request
														.requestMatchers("/login/**").permitAll()
														.anyRequest().authenticated()
						)
						.authenticationProvider()
						.addFilterBefore(, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}
}
