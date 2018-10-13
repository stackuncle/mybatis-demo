package com.miboy.mapper;

import com.miboy.model.Country;

import java.util.List;

/**
 * Created by bowen on 2018/10/13.
 */
public interface CountryMapper {
  List<Country> selectAll();
}
