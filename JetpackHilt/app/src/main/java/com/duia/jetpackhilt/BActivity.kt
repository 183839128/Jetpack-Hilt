package com.duia.jetpackhilt

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.duia.jetpackhilt.inject.PluralClass
import com.duia.jetpackhilt.inject.SingletonClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @fileName: BActivity
 * @date: 2020/11/30 16:16
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
@AndroidEntryPoint
class BActivity :AppCompatActivity() {

    @Inject
    lateinit var pluralClass: PluralClass

    @Inject
    lateinit var singletonClass: SingletonClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Hilt","(onCreate:${Thread.currentThread().stackTrace[2].lineNumber}) pluralClass=$pluralClass  singletonClass=$singletonClass")
        findViewById<TextView>(R.id.tv).text="pluralClass=${pluralClass.tnum} -singletonClass=${singletonClass.num}"
    }
}