package com.duia.jetpackhilt.inject.module

import com.duia.jetpackhilt.inject.BEngine
import com.duia.jetpackhilt.inject.AEngine
import com.duia.jetpackhilt.inject.annotation.BindAEngine
import com.duia.jetpackhilt.inject.annotation.BindBEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import com.duia.jetpackhilt.inject.interf.Engine
/**
 * @fileName: EngineModule
 * @date: 2020/11/30 15:23
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {

    //Qualifier 可以用来区分两个不同的注解同时注册的两个模块 注意如果不使用Qualifier区分Hilt也会分不清两个model
    @BindBEngine
    @Binds
    abstract fun bindAEngine(aEngine: AEngine):Engine

    @BindAEngine
    @Binds
    abstract fun bindBEngine(bEngine: BEngine):Engine
}