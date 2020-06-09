package com.projpurchase.dao;

import com.projpurchase.dto.LoginStatusTransfer;
import com.projpurchase.model.AdminCredentials;
import com.projpurchase.model.AdminRegistration;

public interface AdminDao {
	LoginStatusTransfer getAdmin(AdminCredentials ac);
	int addAdmin(AdminRegistration ar);
}
