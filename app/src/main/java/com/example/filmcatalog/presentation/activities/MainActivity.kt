package com.example.filmcatalog.presentation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.filmcatalog.R
import com.example.filmcatalog.app.App
import com.example.filmcatalog.databinding.ActivityMainBinding
import com.example.filmcatalog.presentation.navigation.FragmentRouter
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var fragmentRouter: FragmentRouter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as App).appComponent.inject(this)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        fragmentRouter.apply {
            setFragmentManager(supportFragmentManager)
            setContainerId(binding.containerFragment.id)
            showCatalogFragment()
        }
    }
}