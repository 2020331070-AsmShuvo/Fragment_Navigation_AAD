package com.example.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class DataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_data, container, false)
        val btn = v.findViewById<Button>(R.id.buttonID)
        btn.setOnClickListener {
            findNavController().navigate(R.id.action_dataFragment_to_lastFragment)
        }

        val btn2 = v.findViewById<Button>(R.id.prevbtn)
        btn2.setOnClickListener {
            findNavController().navigate(R.id.action_dataFragment_to_homeFragment)
        }

        return v
    }

}