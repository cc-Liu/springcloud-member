package com.ccl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccl.entity.Member;
import com.ccl.mapper.MemberMapper;
import com.ccl.service.MemberService;
import com.ccl.utils.R;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 会员表 服务实现类
 *
 * @author Robin
 * @since 2024-04-16
 */
@Slf4j
@Service
@Transactional
@RefreshScope
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    /**
     * @Author liuc
     * @Description 查询会员信息
     * @Date 2024/4/17 11:24
     * @Param []
     * @return com.ccl.until.R<java.util.List<com.ccl.entity.Member>>
     **/
    @Override
    public R<List<Member>> selectMemberList() {
        return R.ok().resultData(memberMapper.selectMemberList());
    }

    /**
   * @Author: liuc
   * @Description: 新增会员信息
   * @Param: [member]
   * @return: com.ccl.until.R
   * @Date: 2024/4/16
   */
    @GlobalTransactional
    @Override
    public R insertMember(Member member) {
        member.setCreateTime(new Date());
        member.setUpdateTime(new Date());
        int insert = memberMapper.insert(member);
        return insert > 0 ? R.ok() : R.error();
    }
}
