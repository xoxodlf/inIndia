/**
 * @Summary   : 
 * @Package : com.tb.bms.user.controller
 * @FileName : UserController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9.  
 * 
 */
package com.tb.bms.user.controller;

import com.tb.bms.user.dao.UserDAOImplement;
import com.tb.bms.user.domain.UserDTO;

/**
 * 
 * @Package : com.tb.bms.user.controller
 * @FileName : UserController.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9. 
 * 
 */
public class UserController {
	UserDAOImplement userDAO=new UserDAOImplement();
	
	public void createUser(UserDTO user) {
		userDAO.createUser(user);
	}
	public UserDTO login(String id,String password) {
		return userDAO.login(id, password);
	}
	public boolean isExist(String id) {
		return userDAO.isExist(id);
	}
}
