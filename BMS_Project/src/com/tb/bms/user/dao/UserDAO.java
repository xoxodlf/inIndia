/**
 * @Summary   : 
 * @Package : com.tb.bms.user.dao
 * @FileName : UserDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9.  
 * 
 */
package com.tb.bms.user.dao;

import com.tb.bms.user.domain.UserDTO;

/**
 * 
 * @Package : com.tb.bms.user.dao
 * @FileName : UserDAO.java
 * @Author : Yang TaeIl
 * @date : 2018. 3. 9. 
 * 
 */
public interface UserDAO {
	public void createUser(UserDTO user);
	public boolean isExist(String id);
	public UserDTO login(String id, String password);
}
