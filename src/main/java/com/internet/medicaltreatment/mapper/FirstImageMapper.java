package com.internet.medicaltreatment.mapper;

import com.internet.medicaltreatment.entity.FirstImage;

public interface FirstImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FirstImage record);

    int insertSelective(FirstImage record);

    FirstImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FirstImage record);

    int updateByPrimaryKey(FirstImage record);
}