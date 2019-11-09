package com.luopeng.dao.impl;

import com.luopeng.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * 账户持久层的实现类
 */
@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {

    public void saveAccount() {
        System.out.println("保存了账户11111111111");
    }
}
