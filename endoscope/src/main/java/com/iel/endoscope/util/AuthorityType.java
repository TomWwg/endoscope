package com.iel.endoscope.util;

/**
 * 枚举类
 * @author wwg
 * @date 2018/2/24
 */
public enum AuthorityType {

    //登录和权限都验证 默认
    Validate,

    //不验证
    NoValidate,

    //验证登录不验证权限
    NoAuthority;
}
