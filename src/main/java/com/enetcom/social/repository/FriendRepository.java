package com.enetcom.social.repository;

import com.enetcom.social.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {

    public Friend findByUid(long u);
}
