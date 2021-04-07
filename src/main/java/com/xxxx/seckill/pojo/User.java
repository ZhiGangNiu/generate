package com.xxxx.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Zero
 * @since 2021-04-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_user")
public class User extends  {

    private static final long serialVersionUID = 1L;

    /**
     * 手机号
     */
    private Long id;

    private String nickname;

    /**
     * MD5(MD5(oass明文+salt)+salt)
     */
    private String password;

    private String slat;

    /**
     * 头像
     */
    private String head;

    /**
     * 注册时间
     */
    private Date registerDate;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginDate;

    /**
     * 登录次数
     */
    private Integer loginCount;


}
