package com.example.filmcatalog.presentation.screens.catalog

import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.filmcatalog.databinding.CatalogFragmentBinding
import com.example.filmcatalog.presentation.navigation.FragmentRouter
import javax.inject.Inject

class CatalogFragment: Fragment() {

    @Inject
    lateinit var catalogViewModel: CatalogViewModel
    @Inject
    lateinit var fragmentRouter: FragmentRouter
    private lateinit var binding: CatalogFragmentBinding

    override fun onResume() {
        super.onResume()
        binding.root.requestFocus()
    }



    private fun showReady(ready: CatalogFragmentViewState.Ready) {
        binding.apply {
            loadingPb.isVisible = false
            filmsListRecyclerView.isVisible = true
            errorLoadFilmList.isVisible = false
            nothingNotFound.isVisible = false
        }
    }

    private fun showEmpty() {
        binding.apply {
            loadingPb.isVisible = false
            filmsListRecyclerView.isVisible = false
            errorLoadFilmList.isVisible = false
            nothingNotFound.isVisible = true
        }
    }

    private fun showLoading() {
        binding.apply {
            loadingPb.isVisible = true
            filmsListRecyclerView.isVisible = false
            errorLoadFilmList.isVisible = false
            nothingNotFound.isVisible = false
        }
    }

    private fun showError() {
        binding.apply {
            loadingPb.isVisible = false
            filmsListRecyclerView.isVisible = false
            errorLoadFilmList.isVisible = false
            nothingNotFound.isVisible = true
        }
    }


    companion object {
        const val TAG: String = "CatalogFragment"
    }
}