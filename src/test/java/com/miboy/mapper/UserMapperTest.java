package com.miboy.mapper;

import com.miboy.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by bowen on 2018/10/13.
 */
public class UserMapperTest extends BaseMapperTest {

  @Test
  public void testSelectById() {
    SqlSession session = sqlSessionFactory.openSession();

    try {
      UserMapper userMapper = session.getMapper(UserMapper.class);
      SysUser user = userMapper.selectById(1L);
      Assert.assertNotNull(user);
      Assert.assertEquals("admin", user.getUserName());
    } finally {
      session.close();
    }
  }

  @Test
  public void testSelectAll() {
    SqlSession session = sqlSessionFactory.openSession();
    try {
      UserMapper userMapper = session.getMapper(UserMapper.class);
      List<SysUser> userList = userMapper.selectAll();
      Assert.assertNotNull(userList);
      Assert.assertTrue(userList.size() > 0);
      for (SysUser user: userList) {
        System.out.println(user.getId() + " " + user.getUserName() + " " + user.getUserInfo());
      }
    } finally {
      session.close();
    }
  }

  @Test
  public void testInsert() {
    SqlSession session = sqlSessionFactory.openSession();
    try {
      UserMapper userMapper = session.getMapper(UserMapper.class);
      SysUser sysUser = new SysUser();
      sysUser.setUserName("test1");
      sysUser.setUserPassword("123456");
      sysUser.setUserEmail("test@miboy.com");
      sysUser.setUserInfo("test info");
      sysUser.setHeadImg(new byte[]{1, 2, 3});
      sysUser.setCreateTime(new Date());
      int result = userMapper.insert(sysUser);
      Assert.assertEquals(1, result);
      Assert.assertNull(sysUser.getId());
    } finally {
      session.rollback();
      session.close();
    }
  }

  @Test
  public void testInsert2() {
    SqlSession session = sqlSessionFactory.openSession();
    try {
      UserMapper userMapper = session.getMapper(UserMapper.class);
      SysUser sysUser = new SysUser();
      sysUser.setUserName("test2");
      sysUser.setUserPassword("123456");
      sysUser.setUserEmail("test2@miboy.com");
      sysUser.setUserInfo("test info2");
      sysUser.setHeadImg(new byte[]{1, 2, 3});
      sysUser.setCreateTime(new Date());
      int result = userMapper.insert2(sysUser);
      Assert.assertEquals(1, result);
      Assert.assertNotNull(sysUser.getId());
      System.out.println("uid = " + sysUser.getId());
    } finally {
      session.rollback();
      session.close();
    }
  }
}
