package com.internet.medicaltreatment.mapper;

import com.internet.medicaltreatment.entity.SecondImage;

public interface SecondImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecondImage record);

    int insertSelective(SecondImage record);

    SecondImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondImage record);

    int updateByPrimaryKey(SecondImage record);
}