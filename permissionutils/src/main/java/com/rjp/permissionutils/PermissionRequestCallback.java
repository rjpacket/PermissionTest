package com.rjp.permissionutils;

/**
 * author : Gimpo create on 2018/2/8 14:01
 * email  : jimbo922@163.com
 */

public interface PermissionRequestCallback {
    void permissionSuccess(int requestCode);

    void permissionFailure(int requestCode);
}
