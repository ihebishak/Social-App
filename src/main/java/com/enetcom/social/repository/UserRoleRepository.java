package com.enetcom.social.repository;

import com.enetcom.social.model.User;
import com.enetcom.social.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    public UserRole findByUser(User user);

}
