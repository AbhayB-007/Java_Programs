package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/* 
 CustomersRepo is created to perform the CRUD 
 operation between server and the application
 and inherited from CrudRepository 
 */

/*public interface CustomersRepo extends CrudRepository<Customers, Integer>{

}*/

// code for REST API
public interface CustomersRepo extends JpaRepository<Customers, Integer>{
	
}
