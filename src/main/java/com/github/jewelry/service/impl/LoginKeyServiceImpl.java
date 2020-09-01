package com.github.jewelry.service.impl;

import com.github.jewelry.service.ILoginKeyService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author 石少东
 * @date 2020-09-01 22:07
 * @since 1.0
 */

@Service
public class LoginKeyServiceImpl implements ILoginKeyService {


    @Override
    public String getLoginKey(String html) {
        String key = StringUtils.substringBetween(html, "window.ws.send('login|155|'+", ");");
        key = StringUtils.substringBetween(html, "var " + key + "=\"", "\";");
        return "login|155|" + key;
    }
}
