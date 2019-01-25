package com.ehi.component1.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ehi.base.ModuleConfig;
import com.ehi.base.interceptor.DialogShowInterceptor;
import com.ehi.component.anno.EHiRouterAnno;
import com.ehi.component1.R;

/**
 * 这个用来测试进这个页面都需要经过一个加载框的拦截器
 */
@EHiRouterAnno(
        host = ModuleConfig.Component1.NAME,
        value = ModuleConfig.Component1.TEST_DIALOG,
        interceptors = DialogShowInterceptor.class
)
public class Component1TestDialogAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.component1_test_dialog_act);
    }
}
