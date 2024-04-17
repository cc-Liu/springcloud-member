package com.ccl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccl.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 会员表 Mapper 接口
 *
 * @author Robin
 * @since 2024-04-16
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

    List<Member> selectMemberList();

}
