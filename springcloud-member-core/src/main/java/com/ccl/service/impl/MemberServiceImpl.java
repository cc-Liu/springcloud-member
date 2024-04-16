package com.ccl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccl.entity.Member;
import com.ccl.mapper.MemberMapper;
import com.ccl.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * 会员表 服务实现类
 *
 * @author Robin
 * @since 2024-04-16
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
