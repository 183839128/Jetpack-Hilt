package com.duia.jetpackhilt.other

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @fileName: NetworkModule
 * @date: 2020/11/30 17:54
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {

    //对okhttp注入
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .build()
    }

    //对retrofit注入
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://www.baidu.com")
            .client(okHttpClient)
            .build()
    }
}