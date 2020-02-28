package com.nanaten.dagger_viewmodel_interface.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nanaten.dagger_viewmodel_interface.R
import com.nanaten.daggerretrofitviewmodel.di.viewmodel.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class MainFragment : DaggerFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(MainViewModelImpl::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel.getRepo()

        viewModel.repo.observe(this, Observer {
            Toast.makeText(
                context,
                "id = ${it.id}, title = ${it.title}, content = ${it.content}",
                Toast.LENGTH_SHORT
            ).show()
        })
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


}
