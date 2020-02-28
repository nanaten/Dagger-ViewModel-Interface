package com.nanaten.dagger_viewmodel_interface.di

import com.nanaten.dagger_viewmodel_interface.MainRepository
import com.nanaten.dagger_viewmodel_interface.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal object RepositoryModule {
    @Singleton
    @Provides
    fun provideMainRepository(): MainRepository =
        MainRepositoryImpl()
}