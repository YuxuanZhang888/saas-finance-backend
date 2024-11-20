package com.yuxuan.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class GetBase64CodeForm {

    @ApiModelProperty(value = "Client ID")
    @NotBlank(message = "Client ID can not be null")
    @Pattern(regexp = "^[0-9A-Za-z]{6,32}$", message = "Invalid client ID")
    private String clientId;
}
