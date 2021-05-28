package com.ex.gene.mapper;

import com.ex.gene.entity.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface RoleMapper {
    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @param id 
     * @return 
     */
    @Delete({
        "delete from role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @param record 
     * @return 
     */
    @Insert({
        "insert into role (id, role_name, ",
        "enabled, create_time, ",
        "update_time, deleted)",
        "values (#{id,jdbcType=INTEGER}, #{roleName,jdbcType=VARCHAR}, ",
        "#{enabled,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{deleted,jdbcType=BIT})"
    })
    int insert(Role record);

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @param record 
     * @return 
     */
    int insertSelective(Role record);

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @param id 
     * @return 
     */
    @Select({
        "select",
        "id, role_name, enabled, create_time, update_time, deleted",
        "from role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.ex.gene.mapper.RoleMapper.BaseResultMap")
    Role selectByPrimaryKey(Integer id);

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @param record 
     * @return 
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @date 2021-05-28 18:37:26
     * @author lishuaiqi
     * @param record 
     * @return 
     */
    @Update({
        "update role",
        "set role_name = #{roleName,jdbcType=VARCHAR},",
          "enabled = #{enabled,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "deleted = #{deleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}