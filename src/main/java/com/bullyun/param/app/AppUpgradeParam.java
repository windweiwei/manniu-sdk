package com.bullyun.param.app;

import com.bullyun.param.BaseParam;
import com.bullyun.response.appdto.AppUpgradeResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AppUpgradeParam extends BaseParam<AppUpgradeResponse> {
    private String appName;
    private String os;
    private String version;
    private String lang;

    @Override
    public String getApi() {
        return "/api/v1/app/upgrade";
    }
}
