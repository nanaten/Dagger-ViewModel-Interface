package com.nanaten.dagger_viewmodel_interface

import com.nanaten.dagger_viewmodel_interface.database.Repo

interface MainRepository {
    fun getRepo(): Repo
}

class MainRepositoryImpl : MainRepository {
    override fun getRepo(): Repo {
        return Repo(id = 1, title = "タイトル", content = "内容")
    }
}