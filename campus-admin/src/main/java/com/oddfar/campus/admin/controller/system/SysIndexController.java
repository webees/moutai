package com.oddfar.campus.admin.controller.system;

import com.oddfar.campus.common.config.CampusConfig;
import com.oddfar.campus.common.domain.R;
import com.oddfar.campus.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 首页
 *
 * @author oddfar
 */
@RestController
public class SysIndexController {
    /**
     * 系统基础配置
     */
    @Autowired
    private CampusConfig campusConfig;

    /**
     * 访问首页，提示语
     */
    @RequestMapping("/")
    public String index() {
        return StringUtils.format("v{}", campusConfig.getVersion());
    }

    @Value("${campus.version}")
    private String version;

    @Value("${campus.frameworkVersion}")
    private String frameworkVersion;

    /**
     * 版本情况
     */
    @RequestMapping("/version")
    public R version() {
        HashMap<String, String> map = new HashMap<>();
        map.put("version", version);
        map.put("frameworkVersion", frameworkVersion);
        return R.ok(map);
    }
}
