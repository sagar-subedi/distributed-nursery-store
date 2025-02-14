package np.com.sagar88.nurserystoreaccountservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author: ReLive
 * @date: 2021/12/25 2:05 下午
 */
@EnableWebSecurity
@EnableMethodSecurity
@Configuration
public class ResourceServerConfig {

    @Autowired
    CustomJwtAuthenticationConverter customJwtAuthenticationConverter;

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/resource/test/**").hasAuthority("SCOPE_message.read")
                .requestMatchers("/**").authenticated())
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(
                        jwt -> jwt.jwtAuthenticationConverter(customJwtAuthenticationConverter)
                ));
        return http.build();
    }
}
