package com.ccl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccl.entity.Member;
import com.ccl.mapper.MemberMapper;
import com.ccl.service.MemberService;
import com.ccl.until.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 会员表 服务实现类
 *
 * @author Robin
 * @since 2024-04-16
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

    @Resource
    private MemberMapper memberMapper;

   /**
   * @Author: liuc
   * @Description: 新增会员信息
   * @Param: [member]
   * @return: com.ccl.until.R
   * @Date: 2024/4/16
   */
    @Override
    public R insertMember(Member member) {
        return memberMapper.insert(member) > 0 ? R.ok() : R.error();
    }
}
