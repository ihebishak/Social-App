package com.enetcom.social.Service;


import com.enetcom.social.model.Friend;
import com.enetcom.social.model.Post;
import com.enetcom.social.model.User;
import com.enetcom.social.model.UserRole;

import java.util.List;
import java.util.Set;


public interface UserService {

	//creating user
	public Boolean createUser(User user, Set<UserRole> userRoles);
    //update user
	public Boolean updateUser(User user);
    //get user by username
	public User getUser(String username);
	//get user by uid
	public User getUserById(long uid);
	//get all users details
	public List<User> getUsers();
	//delete user by id
	public Boolean deleteUser(long id);
   
	//create friend
	public Boolean addFriend(User user,String username);
	//remove friend
	public Boolean removeFriend(User user,long friend_id);
	//get friends
	public List<Friend> getFriends(User user);
	
	//create friend
	public Boolean addPost(User user, Post post);
	//remove friend
	public Boolean removePost(User user,long post_id);
	//get friends
	public List<Post> getPosts(User user);
	//edit post
	public Boolean editPost(User user,Post post);
	//edit friend post
    public Boolean editFriendPost(long uid,Post post);
		

    //get count of friends
    public int countFriends(User user);
    //get count of posts
    public int countPosts(User user);
    
	//get users not-friend
	public List<User> getUserNotFriend(User user);
}

