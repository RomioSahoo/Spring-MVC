package com.dao;

import com.dto.LoginStatusTransfer;
import com.model.Credentials;

public interface UserDao {

	LoginStatusTransfer getUser(Credentials c);
}
