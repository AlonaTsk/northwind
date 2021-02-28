package fi.vamk.e1900320.northwind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter {
      @Autowired
      private ReaderRepository readerRepository;
      @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .authorizeRequests()
          .antMatchers("/").access("hasRole('READER')")
          .antMatchers("/**").permitAll()
          .and()
          .formLogin()
          .loginPage("/login")
          .failureUrl("/login?error=true");
          
    }
	//private DaoAuthenticationConfigurer<AuthenticationManagerBuilder, UserDetailsService> userDetailsService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	/*PasswordEncoder encoder = 
          PasswordEncoderFactories.createDelegatingPasswordEncoder();
    	userDetailsService =*/ auth
          .userDetailsService(new UserDetailsService(){
                @Override
                public UserDetails loadUserByUsername(String username)
                throws UsernameNotFoundException{
                      return readerRepository.findByUsername(username);
                }
          });
    }

    
}
