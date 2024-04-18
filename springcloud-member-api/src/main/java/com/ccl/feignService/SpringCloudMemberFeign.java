package com.ccl.feignService;

import com.ccl.entity.Member;
import com.ccl.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springcloud-member")
public interface SpringCloudMemberFeign {

    @RequestMapping("/member/insertMember")
    R insertMember(@RequestBody Member member);
}
