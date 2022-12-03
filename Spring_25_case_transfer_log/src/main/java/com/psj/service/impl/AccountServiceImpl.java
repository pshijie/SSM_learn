package com.psj.service.impl;

import com.psj.dao.AccountDao;
import com.psj.service.AccountService;
import com.psj.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void transfer(String out,String in ,Double money) {
        try{
            accountDao.outMoney(out,money);
            int i = 1/0;
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);  // 保证代码运行
        }
    }

}
