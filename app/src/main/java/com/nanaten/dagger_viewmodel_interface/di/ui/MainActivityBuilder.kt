package com.nanaten.dagger_viewmodel_interface.di.ui

import com.nanaten.dagger_viewmodel_interface.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MainActivityBuilder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}