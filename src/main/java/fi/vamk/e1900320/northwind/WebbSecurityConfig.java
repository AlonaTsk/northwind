package fi.vamk.e1900320.northwind;
/*
import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;

@Configuration
public class WebbSecurityConfig extends WebSecurityConfigurerAdapter {

 	@Override
        protected void configure(HttpSecurity http) throws Exception {
                http.csrf().disable().authorizeRequests().antMatchers("/", "/index").permitAll().anyRequest().authenticated().and().httpBasic();                                .and().httpBasic();
        }

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.ldapAuthentication()
		        .userSearchFilter("uid={0}")
		        .contextSource()
		        .url("ldap://ldap.puv.fi:389/dc=puv,dc=fi");
	}
}

@RestTemplate restTemplate() throws Exception {
    SSLContext sslContext = new SSLContextBuilder()
      .loadTrustMaterial(trustStore.getURL(), trustStorePassword.toCharArray())
      .build();
    SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);
    HttpClient httpClient = HttpClients.custom()
      .setSSLSocketFactory(socketFactory)
      .build();
    HttpComponentsClientHttpRequestFactory factory = 
      new HttpComponentsClientHttpRequestFactory(httpClient);
    return new RestTemplate(factory);
}
*/