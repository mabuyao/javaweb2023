package com.xiaoma.schedule.service.impl;

import com.xiaoma.schedule.dao.SysUserDao;
import com.xiaoma.schedule.dao.impl.SysUserDaoImpl;
import com.xiaoma.schedule.pojo.SysUser;
import com.xiaoma.schedule.service.SysUserService;
import com.xiaoma.schedule.util.MD5Util;

/**
 * ClassName: SysUserServiceImpl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/8 16:49
 * @Version 1.0
 */
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao = new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {
        //将用户的明文密码转换为密文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        //调用dao层方法，将SysUser数据存入数据库
        return userDao.addSysUser(sysUser);
    }

    @Override
    public SysUser findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
