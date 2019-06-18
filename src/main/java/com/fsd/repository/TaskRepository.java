package com.fsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fsd.model.Project;
import com.fsd.model.Task;
import com.fsd.model.User;


public interface TaskRepository extends JpaRepository <Task, Integer> {

	 @Query("SELECT a FROM Task a WHERE a.status != 'DeActive' ")    
	 public List getActiveTasks();
	 
	 @Query("SELECT a FROM Task a WHERE a.id=:id")    
	 public Task fetchTaskById(@Param("id") int id);
	 
    /*@Query("DELETE a FROM Task a WHERE a.id = :id")    
	 public Task deleteTaskByTaskId(@Param("id") int id);
	 */
	   
	 
	 
}