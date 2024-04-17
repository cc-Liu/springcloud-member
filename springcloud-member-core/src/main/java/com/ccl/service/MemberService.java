package com.ccl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccl.entity.Member;
import com.ccl.utils.R;

import java.util.List;

/**
 * 会员表 服务类
 *
 * @author Robin
 * @since 2024-04-16
 */
public interface MemberService extends IService<Member> {

    R<List<Member>> selectMemberList();

    R insertMember(Member member);

}
