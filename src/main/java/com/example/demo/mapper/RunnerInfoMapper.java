package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RunnerInfoMapper {
    String selRunnerInfo(Long id);
}
