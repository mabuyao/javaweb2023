package com.xiaoma.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: SysSchedule
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/8 14:56
 * @Version 1.0
 */
@AllArgsConstructor  //相当于添加了全参构造
@NoArgsConstructor   //相当于添加了无参构造
@Data  //getter setter hashcode equals toString
public class SysSchedule implements Serializable {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;
}
