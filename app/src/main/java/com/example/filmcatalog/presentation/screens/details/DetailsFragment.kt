package com.example.filmcatalog.presentation.screens.details

import androidx.fragment.app.Fragment
import com.example.filmcatalog.databinding.DetailsFragmentBinding
import javax.inject.Inject

class DetailsFragment: Fragment() {

    @Inject
    lateinit var detailsViewModel: DetailsViewModel
    private lateinit var binding: DetailsFragmentBinding
    companion object {
        const val TAG: String = "DetailsFragment"
        const val EXTRA_RECIPE_ID = "EXTRA_RECIPE_ID"
    }
}