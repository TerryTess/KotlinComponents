package com.example.myapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapp.R
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentPictureInPictureBinding


class PictureInPictureFragment : Fragment() {

    private lateinit var binding: FragmentPictureInPictureBinding  // Adjust this line according to your binding class

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPictureInPictureBinding.inflate(inflater, container, false)

        // Set up the button click listener
        binding.plant.setOnClickListener {
            findNavController().navigate(R.id.action_pictureInPictureFragment_to_plantsFragment)
        }

        return binding.root
    }
}
