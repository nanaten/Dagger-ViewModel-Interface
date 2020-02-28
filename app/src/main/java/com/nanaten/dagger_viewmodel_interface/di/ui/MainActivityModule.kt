package com.nanaten.dagger_viewmodel_interface.di.ui

import androidx.lifecycle.ViewModel
import com.nanaten.dagger_viewmodel_interface.ui.MainFragment
import com.nanaten.dagger_viewmodel_interface.ui.MainViewModelImpl
import com.nanaten.daggerretrofitviewmodel.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface MainActivityModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModelImpl::class)
    fun bindMainViewModel(viewModel: MainViewModelImpl): ViewModel

    @ContributesAndroidInjector
    fun bindMainFragment(): MainFragment
}