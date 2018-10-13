package com.miboy.mapper;

import com.miboy.model.SysUser;

import java.util.List;

/**
 * Created by bowen on 2018/10/13.
 */
public interface UserMapper {
  SysUser selectById(Long id);
  List<SysUser> selectAll();
  int insert(SysUser sysUser);
  int insert2(SysUser sysUser);
}
