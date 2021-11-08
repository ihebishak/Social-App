package com.enetcom.social.Service.impl;

import com.enetcom.social.model.User;
import com.enetcom.social.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = this.userRepository.findByUsername(username);
		if(user == null)
		{
			System.out.println("user not found");
			throw new UsernameNotFoundException("No user found!! invalid credentials");
		}
		return (UserDetails) user;
	}

}
