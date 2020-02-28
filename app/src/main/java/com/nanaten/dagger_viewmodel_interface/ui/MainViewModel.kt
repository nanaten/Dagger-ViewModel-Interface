package com.nanaten.dagger_viewmodel_interface.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nanaten.dagger_viewmodel_interface.MainRepository
import com.nanaten.dagger_viewmodel_interface.database.Repo
import javax.inject.Inject

interface MainViewModel {
    val repo: LiveData<Repo>
    fun getRepo()
}

class MainViewModelImpl @Inject constructor(private val repository: MainRepository) : ViewModel(),
    MainViewModel {
    override val repo = MutableLiveData<Repo>()
    override fun getRepo() {
        val data = repository.getRepo()
        repo.postValue(data)
    }
}