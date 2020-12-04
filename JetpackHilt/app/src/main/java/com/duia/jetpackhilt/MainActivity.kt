package com.duia.jetpackhilt

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.duia.jetpackhilt.inject.PluralClass
import com.duia.jetpackhilt.inject.SingletonClass
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var pluralClass: PluralClass

    @Inject
    lateinit var retrofit: Retrofit

    @Inject
    lateinit var singletonClass: SingletonClass


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pluralClass.onSet()
        findViewById<TextView>(R.id.tv)?.apply {
            text = "pluralClass=${pluralClass.tnum} singletonClass=${singletonClass.num}"
            setOnClickListener {
                singletonClass.num = 10
                pluralClass.startActivity()
            }
        }

    }
}