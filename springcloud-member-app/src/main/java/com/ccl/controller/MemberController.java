package com.ccl.controller;


import cn.hutool.json.JSONUtil;
import com.ccl.entity.Member;
import com.ccl.service.MemberService;
import com.ccl.until.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 会员表 前端控制器
 *
 * @author Robin
 * @since 2024-04-16
 */
@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    /**
    * @Author: liuc
    * @Description: 新增会员信息
    * @Param: [member]
    * @return: com.ccl.until.R
    * @Date: 2024/4/16
    */
    @RequestMapping("/insertMember")
    public R insertMember(@RequestBody Member member){
        log.info("\n新22增会员信息:{}", JSONUtil.parse(member));
        return memberService.insertMember(member);
    }

    @RequestMapping("/selectMemberList")
    public R selectMemberList(){
        return memberService.selectMemberList();
    }
}

