package com.miboy.mapper;

import com.miboy.dao.CountryMapper;
import com.miboy.entity.CountryExample;
import com.miboy.entity.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by bowen on 2018/10/13.
 */
public class CountryMapperTest extends BaseMapperTest {
  @Test
  public void testSelectAll() {
    SqlSession session = sqlSessionFactory.openSession();
    try {
      List<Country> countryList = session.selectList("com.miboy.mapper.CountryMapper.selectAll");
      for (Country country: countryList) {
        System.out.println(country.getId() + " " + country.getCountrycode() + " " + country.getCountryname());
      }
    } finally {
      session.close();
    }
  }

  @Test
  public void testExample() {
    SqlSession session = sqlSessionFactory.openSession();
    try {
      CountryMapper countryMapper = session.getMapper(CountryMapper.class);
      CountryExample example = new CountryExample();
      example.setOrderByClause("id desc, countryname asc");
      example.setDistinct(true);

      CountryExample.Criteria criteria = example.createCriteria();
      criteria.andIdGreaterThan(1);

      List<Country> countryList = countryMapper.selectByExample(example);
      for (Country country: countryList) {
        System.out.println(country.getId() + " " + country.getCountrycode() + " " + country.getCountryname());
      }
    } finally {
      session.close();
    }
  }
}
