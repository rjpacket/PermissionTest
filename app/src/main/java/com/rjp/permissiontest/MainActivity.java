package com.rjp.permissiontest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.rjp.permissionutils.Action;
import com.rjp.permissionutils.PermissionUtils;
import com.rjp.permissionutils.Permission;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PermissionUtils.with(MainActivity.this)
                        .permission(Permission.CAMERA)
                        .onGranted(new Action() {
                            @Override
                            public void onAction(List<String> permissions) {
                                Log.d("------->", "允许了");
                            }
                        })
                        .onDenied(new Action() {
                            @Override
                            public void onAction(List<String> permissions) {
                                Log.d("------->", "拒绝了");
                            }
                        })
                        .start();
            }
        });
    }
}
