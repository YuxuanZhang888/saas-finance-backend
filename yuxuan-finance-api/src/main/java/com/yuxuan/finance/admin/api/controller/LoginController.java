package com.yuxuan.finance.admin.api.controller;
import com.yuxuan.common.dto.ApiResponse;
import com.yuxuan.finance.biz.dto.form.GetBase64CodeForm;
import com.yuxuan.finance.biz.service.MemberLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "User login module")
@RestController
@RequestMapping(value = "/login")
@RequiredArgsConstructor
@Slf4j
public class LoginController {
    final MemberLoginService memberLoginService;

    @ApiOperation(value = "Get client ID")
    @GetMapping(value = "/getClientID")
    public ApiResponse<String> getClientId() {
        String clientId = memberLoginService.getClientId();
        return ApiResponse.success(clientId);
    }

    @ApiOperation(value = "Get Base 64 verification code")
    @GetMapping(value = "/getBase64Code")
    public ApiResponse<String> getBase64Code(@Validated @ModelAttribute GetBase64CodeForm form) {
        String base64Code = memberLoginService.getBase64Code(form);
        return ApiResponse.success(base64Code);
    }
}
