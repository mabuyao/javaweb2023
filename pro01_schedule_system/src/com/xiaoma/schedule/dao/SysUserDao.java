package com.xiaoma.schedule.dao;

import com.xiaoma.schedule.pojo.SysUser;

import java.util.List;

/**
 * ClassName: SysUserDao
 * Description:
 * Data Access Object 数据访问对象
 * @Author Mabuyao
 * @Create 2023/11/8 14:59
 * @Version 1.0
 */
public interface SysUserDao {
    /**
     * 用于向数据库中增加一条用户记录
     * @param user 用户数据以SysUser实体类对象形式入参
     * @return 返回影响数据库记录的行数，行数为0说明增加失败，行数大于0说明增加成功
     */
    int addSysUser(SysUser user);

    /**
     * 查询所有用户的所有信息
     * @return 将所有信息放入一个：List<SysUser>集合中
     */
    List<SysUser> findAll();

    /**
     * 根据用户名获得完整用户信息的方法
     * @param username 要查询的用户名
     * @return 如果找到了返回SysUser对象，找不到返回null
     */
    SysUser findByUsername(String username);
}
