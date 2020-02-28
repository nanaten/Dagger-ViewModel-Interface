package com.nanaten.dagger_viewmodel_interface

import com.nanaten.dagger_viewmodel_interface.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory()
            .create(this)
    }
}