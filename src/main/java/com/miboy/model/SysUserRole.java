package com.miboy.model;

/**
 * Created by bowen on 2018/10/13.
 */
public class SysUserRole {
  private Long userId;
  private Long roleId;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }
}
