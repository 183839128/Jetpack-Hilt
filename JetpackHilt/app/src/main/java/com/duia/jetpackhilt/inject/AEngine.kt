package com.duia.jetpackhilt.inject
import com.duia.jetpackhilt.inject.interf.Engine
import android.util.Log
import javax.inject.Inject

/**
 * @fileName: GasEngine
 * @date: 2020/11/30 15:09
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
class AEngine @Inject constructor(): Engine {
    override fun start() {
        Log.e("Hilt","(start:${Thread.currentThread().stackTrace[2].lineNumber}) AEngine engine start.")
    }

    override fun shutdown() {
        Log.e("Hilt","(shutdown:${Thread.currentThread().stackTrace[2].lineNumber}) AEngine engine shutdown.")
    }

}