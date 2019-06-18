package com.fsd.service;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
 
import com.fsd.model.User;
import com.fsd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



 
@Service("UserService")
public class UserService
{
    private List<User> Users = new ArrayList<User>();
 
    public List<User> getUsers() {
        return Users;
    }
 
    public void setUsers(List<User> Users) {
        this.Users = Users;
    }
    
    @Autowired
    UserRepository UserRepository;
    
    @Transactional
    public List getAllUsers() {
     List<User> Users=new ArrayList();
     Iterable UserIterable=UserRepository.findAll();
     Iterator UserIterator=UserIterable.iterator();
     while(UserIterator.hasNext())
     {
    	 Users.add((User) UserIterator.next());
     }
     return Users;
    }
    
   /* @Transactional
    public User getUser(int id) {
     return UserRepository..fetchUserByEmpID(  ).findOne(id);
    }*/
    
    @Query
    public User findByFirstName(String firstName){
    	return UserRepository.fetchUserByFirstName(firstName);
    }
    
    @Query
    public User findByLastName(String lastName){
    	return UserRepository.fetchUserByLastName(lastName);
    }
    
    @Query
    public User findByEmpID(int EmpID){
    	return UserRepository.fetchUserByEmpId(EmpID);
    }
    
    
    @Transactional
    public void addUser(User User) {
    	UserRepository.save(User);
    }
    
    @Transactional
    public void updateUser(User User) {
    	UserRepository.save(User);
    
    }
    
    @Transactional
    public void deleteUser(int id) {
    	
    	User user = UserRepository.getOne(id);
    	UserRepository.delete(user);
    }
}