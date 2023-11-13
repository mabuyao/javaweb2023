package com.xiaoma.schedule.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * ClassName: SysUser
 * Description:
 * 1 实体类的类名和表格名称应该对应（对应不是一致）
 * 2 实体类的属性名和表格的列名应该对应
 * 3 每个属性都必须是私有的
 * 4 每个属性都应该具备 getter setter
 * 5 必须具备无参构造器
 * 6 应该实现序列化接口（缓存 分布式项目数据传递 可能会将对象序列化）
 * 7 应该重写类的hashcode和equals方法
 * 8 toString是否重写都可以
 *
 * 使用lombok帮助我们生成这些内容  getter setter 全参构造 无参构造 hashcode等
 * @Author Mabuyao
 * @Create 2023/11/8 14:39
 * @Version 1.0
 */
@AllArgsConstructor  //相当于添加了全参构造
@NoArgsConstructor   //相当于添加了无参构造
@Data  //getter setter hashcode equals toString
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;
}
