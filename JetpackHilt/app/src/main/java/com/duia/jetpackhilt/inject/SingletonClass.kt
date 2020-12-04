package com.duia.jetpackhilt.inject

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.annotation.Signed
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @fileName: Driver
 * @date: 2020/11/30 14:35
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
@Singleton
class SingletonClass @Inject constructor() {
    //该类为全局单例 每次获取都是同一个对象
    var num =5
}