package com.aisc.member.mapper;


import com.aisc.member.pojo.AiscUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AiscUserMapper extends Mapper<AiscUser> {
    String getUserInfoById(@Param("userId") Integer valueOf);
}