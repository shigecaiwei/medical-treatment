package com.internet.medicaltreatment.mapper;

import com.internet.medicaltreatment.entity.Diary;

public interface DiaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Diary record);

    int insertSelective(Diary record);

    Diary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Diary record);

    int updateByPrimaryKey(Diary record);
}