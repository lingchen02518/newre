package com.example.yk_study.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yk_study.po.userpo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 虎哥
 * @since 2024-03-04
 */

public interface UserMapper extends BaseMapper<userpo> {
        void insertBatchSomeColumn(@Param("list")List<userpo> userpoList);
}
