package com.ccl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccl.entity.Member;
import com.ccl.until.R;

/**
 * 会员表 服务类
 *
 * @author Robin
 * @since 2024-04-16
 */
public interface MemberService extends IService<Member> {

    R insertMember(Member member);

}
