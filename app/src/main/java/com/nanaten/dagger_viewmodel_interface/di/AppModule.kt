package com.nanaten.dagger_viewmodel_interface.di

import android.content.Context
import com.nanaten.dagger_viewmodel_interface.App
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun provideContext(application: App): Context

}