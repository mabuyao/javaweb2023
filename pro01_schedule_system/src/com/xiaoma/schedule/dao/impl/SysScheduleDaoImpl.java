package com.xiaoma.schedule.dao.impl;

import com.xiaoma.schedule.dao.BaseDao;
import com.xiaoma.schedule.dao.SysSchedualDao;
import com.xiaoma.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * ClassName: SysScheduleDaoImpl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/8 15:04
 * @Version 1.0
 */
public class SysScheduleDaoImpl extends BaseDao implements SysSchedualDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        int rows = baseUpdate(sql,schedule.getUid(),schedule.getTitle(),schedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "select sid,uid,title,completed from sys_schedule";
        List<SysSchedule> sysScheduleList = baseQuery(SysSchedule.class, sql);
        return sysScheduleList;
    }
}
