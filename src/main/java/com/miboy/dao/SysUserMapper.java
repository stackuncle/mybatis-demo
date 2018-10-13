package com.miboy.dao;

import com.miboy.entity.SysUser;
import com.miboy.entity.SysUserExample;
import com.miboy.entity.SysUserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserWithBLOBs record);

    int insertSelective(SysUserWithBLOBs record);

    List<SysUserWithBLOBs> selectByExampleWithBLOBs(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    SysUserWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserWithBLOBs record, @Param("example") SysUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SysUserWithBLOBs record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysUserWithBLOBs record);

    int updateByPrimaryKey(SysUser record);
}