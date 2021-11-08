package com.enetcom.social.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
@Data
public class Authority implements GrantedAuthority  {
	
	private String authority;


	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}
  
}
