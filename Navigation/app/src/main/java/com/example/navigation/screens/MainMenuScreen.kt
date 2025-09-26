package com.example.navigation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class MainMenuScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up button click listeners
        view.findViewById<android.widget.Button>(R.id.jaimeButton).setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuScreen_to_jaimeProfileScreen)
        }

        view.findViewById<android.widget.Button>(R.id.ericButton).setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuScreen_to_ericProfileScreen)
        }
    }
}
