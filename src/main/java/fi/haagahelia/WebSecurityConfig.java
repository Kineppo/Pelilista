package fi.haagahelia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            	.antMatchers("/", "/login.html", "/masse.jpg").permitAll()
            	.antMatchers(HttpMethod.DELETE,"/api/**").hasRole("ADMIN")
            	.antMatchers(HttpMethod.POST,"/api/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login.html")
                .defaultSuccessUrl("/lista.html")
                .permitAll()
                .and()
                .csrf().disable()
            .logout()
                .permitAll();
    }
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

       auth
            .inMemoryAuthentication()
                .withUser("user").password("user123").roles("USER");
        auth
        	.inMemoryAuthentication()
        		.withUser("admin").password("admin123").roles("USER", "ADMIN");
    }
}
