package com.luopeng.dao.impl;

import com.luopeng.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户222222222");
    }
}
