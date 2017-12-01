package com.iel.endoscope.dto;

import com.iel.endoscope.entity.Role;

import java.util.Date;

/**
 * 角色的传入参数的转换
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
public class RoleDto {

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     *  所属医院ID
     */
    private Long hospitalId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static Role form(RoleDto dto){
        Role role = null;
        if(dto != null){
            role = new Role();
            role.setRoleId(dto.getRoleId());
            role.setHospitalId(dto.getHospitalId());
            role.setRoleName(dto.getRoleName());
            role.setRemark(dto.getRemark());
            role.setCreateTime(dto.getCreateTime());
        }
        return role;
    }
}
