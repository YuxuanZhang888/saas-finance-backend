package com.yuxuan.finance.biz.service;

import com.yuxuan.finance.biz.dto.form.GetBase64CodeForm;

public interface MemberLoginService {
    /**
     * Get client ID
     * @return
     */
    String getClientId ();

    /**
     * Get verification code
     * @param form
     * @return
     */
    String getBase64Code(GetBase64CodeForm form);
}
