package com.dao;

import com.dto.LoginStatusTransfer;
import com.dto.LoginStatusTransferEmail;
import com.model.Credentials;
import com.model.Register;

public interface UserDao {

	LoginStatusTransfer getUser(Credentials c);

	LoginStatusTransferEmail getPass(Credentials c);

	int addUser(Register reg);

}
