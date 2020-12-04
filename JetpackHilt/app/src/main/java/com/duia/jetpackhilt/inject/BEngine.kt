package com.duia.jetpackhilt.inject

import com.duia.jetpackhilt.inject.interf.Engine
import android.util.Log
import javax.inject.Inject

/**
 * @fileName: Electric
 * @date: 2020/11/30 15:13
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
class BEngine @Inject constructor() : Engine {

    override fun start() {
        Log.e(
            "Hilt",
            "(start:${Thread.currentThread().stackTrace[2].lineNumber}) BEngine engine start."
        )
    }

    override fun shutdown() {
        Log.e(
            "Hilt",
            "(start:${Thread.currentThread().stackTrace[2].lineNumber}) BEngine engine shutdown."
        )
    }
}