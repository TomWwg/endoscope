package com.iel.endoscope.entity;

import java.util.Date;

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
    private Date createTime;

    // Constructors

    /**
     * default constructor
     */
    public Role() {
    }

    /**
     * full constructor
     */
    public Role(Long hospitalId, String roleName, String remark, Date createTime) {
        this.hospitalId = hospitalId;
        this.roleName = roleName;
        this.remark = remark;
        this.createTime = createTime;
    }

    // Property accessors

    /**
     * 角色ID
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 所属医院ID
     */
    public Long getHospitalId() {
        return this.hospitalId;
    }

    /**
     * 所属医院ID
     */
    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 角色名称
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}