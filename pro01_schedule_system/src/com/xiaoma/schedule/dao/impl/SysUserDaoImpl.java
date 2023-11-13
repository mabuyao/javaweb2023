package com.xiaoma.schedule.dao.impl;

import com.xiaoma.schedule.dao.BaseDao;
import com.xiaoma.schedule.dao.SysUserDao;
import com.xiaoma.schedule.pojo.SysUser;

import java.util.List;

/**
 * ClassName: SysUserDaoImpl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/8 15:04
 * @Version 1.0
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addSysUser(SysUser user) {
        String sql = "insert into sys_user values(DEFAULT,?,?)";
        int rows = baseUpdate(sql,user.getUsername(),user.getUserPwd());
        return rows;
    }

    @Override
    public List<SysUser> findAll() {
        String sql = "select uid,username,user_pwd userPwd from sys_user";
        List<SysUser> sysUserList = baseQuery(SysUser.class,sql);
        return sysUserList;
    }

    @Override
    public SysUser findByUsername(String username) {
        String sql = "select uid,username,user_pwd userPwd from sys_user where username = ?";
        List<SysUser> sysUserList = baseQuery(SysUser.class, sql, username);
        return sysUserList != null && sysUserList.size() > 0 ? sysUserList.get(0) : null;
    }
}
