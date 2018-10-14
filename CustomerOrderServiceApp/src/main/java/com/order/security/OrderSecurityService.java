package com.order.security;


import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
*/
//@EnableWebSecurity
public class OrderSecurityService {
//extends WebSecurityConfigurerAdapter{

	//@Override
	/*protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/createOrder")
		.hasAnyRole("USER","ADMIN").antMatchers("/console").hasRole("ADMIN").and()
		.csrf().disable().headers().frameOptions().disable();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("chintu").password("{noop}chintu")
		.roles("USER").and().withUser("chintu1").password("{noop}chintu1")
		.roles("USER", "ADMIN");
		
	}*/

	

}
