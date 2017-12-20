package com.iel.endoscope.entity;

import java.sql.Timestamp;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public class Role implements java.io.Serializable {

    // Fields

    // 角色ID
    private Long roleId;
    // 所属医院ID
    private Long hospitalId;
    // 角色名称
    private String roleName;
    // 备注
    private String remark;
    // 创建时间
    private Timestamp createTime;

    // Constructors

    /**
     * default constructor
     */
    public Role() {
    }

    /**
     * full constructor
     */
    public Role(Long hospitalId, String roleName, String remark, Timestamp createTime) {
        this.hospitalId = hospitalId;
        this.roleName = roleName;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}