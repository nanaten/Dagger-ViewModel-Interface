package com.nanaten.dagger_viewmodel_interface.di

import com.nanaten.dagger_viewmodel_interface.App
import com.nanaten.dagger_viewmodel_interface.di.ui.MainActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityBuilder::class,
        RepositoryModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App): AppComponent
    }
}

