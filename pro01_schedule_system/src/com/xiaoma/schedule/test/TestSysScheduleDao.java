package com.xiaoma.schedule.test;

import com.xiaoma.schedule.dao.SysSchedualDao;
import com.xiaoma.schedule.dao.impl.SysScheduleDaoImpl;
import com.xiaoma.schedule.pojo.SysSchedule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

/**
 * ClassName: TestSysScheduleDao
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/8 16:30
 * @Version 1.0
 */
public class TestSysScheduleDao {
    private static SysSchedualDao schedualDao;

    @BeforeAll
    public static void initScheduleDao(){
        schedualDao = new SysScheduleDaoImpl();
    }

    @Test
    public void testAddSchedule(){
        int rows = schedualDao.addSchedule(new SysSchedule(null,2,"learn mysql",1));
        System.out.println(rows);
    }

    @Test
    public void testFindAll(){
        List<SysSchedule> scheduleList = schedualDao.findAll();
        scheduleList.forEach(System.out::println);
    }
}
