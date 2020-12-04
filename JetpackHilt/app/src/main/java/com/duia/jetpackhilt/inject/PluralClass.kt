package com.duia.jetpackhilt.inject

import android.content.Context
import android.content.Intent
import android.util.Log
import com.duia.jetpackhilt.BActivity
import com.duia.jetpackhilt.inject.annotation.BindAEngine
import com.duia.jetpackhilt.inject.annotation.BindBEngine
import com.duia.jetpackhilt.inject.interf.Engine
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

/**
 * @fileName: Truck
 * @date: 2020/11/30 14:18
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
class PluralClass @Inject constructor(val singletonClass: SingletonClass, @ActivityContext val context: Context) {
    //该类为没有设置作用域 默认为无作用域 每次都会创建一个新的绑定实例

    @BindBEngine
    @Inject
    lateinit var aEngine: Engine

    @BindAEngine
    @Inject
    lateinit var bEngine: Engine

    var tnum = 5
    fun onSet() {
        aEngine.start()
        bEngine.start()
        Log.e(
            "Hilt",
            "(deliver:${Thread.currentThread().stackTrace[2].lineNumber})PluralClass  singletonClass=$singletonClass"
        )
        tnum = 10
        bEngine.shutdown()
        aEngine.shutdown()
    }

    fun startActivity() {
        context?.startActivity(Intent(context, BActivity::class.java))
    }
}