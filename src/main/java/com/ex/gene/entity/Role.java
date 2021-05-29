package com.ex.gene.entity;

import java.util.Date;

/**
 * 解决了issue214
 *  角色表
 *
 * 对应数据库表： role
 *
 * @date 2021-05-28 18:37:26
 * @author lishuaiqi
 */
public class Role {
    /**
     * 角色ID
     *
     * This field corresponds to the database column role.id
     */
    private Integer id;

    /**
     * 角色名
     *
     * This field corresponds to the database column role.role_name
     */
    private String roleName;

    /**
     * 有效标志
     *
     * This field corresponds to the database column role.enabled
     */
    private Boolean enabled;

    /**
     * 创建时间
     *
     * This field corresponds to the database column role.create_time
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * This field corresponds to the database column role.update_time
     */
    private Date updateTime;

    /**
     * 逻辑删除
     *
     * This field corresponds to the database column role.deleted
     */
    private Boolean deleted;

    /**
     *
     * @return 数据库表的 role.id字段
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column role.id
     *
     * @param id 角色ID
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return 数据库表的 role.role_name字段
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method sets the value of the database column role.role_name
     *
     * @param roleName 角色名
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     *
     * @return 数据库表的 role.enabled字段
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method sets the value of the database column role.enabled
     *
     * @param enabled 有效标志
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     *
     * @return 数据库表的 role.create_time字段
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column role.create_time
     *
     * @param createTime 创建时间
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @return 数据库表的 role.update_time字段
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method sets the value of the database column role.update_time
     *
     * @param updateTime 更新时间
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @return 数据库表的 role.deleted字段
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method sets the value of the database column role.deleted
     *
     * @param deleted 逻辑删除
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @param that 
     * @return 
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @return 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", enabled=").append(enabled);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}