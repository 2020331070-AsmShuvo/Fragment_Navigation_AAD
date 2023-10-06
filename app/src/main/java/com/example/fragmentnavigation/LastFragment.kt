package com.example.fragmentnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class LastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_last, container, false)
        var btn = view.findViewById<Button>(R.id.buttonID3)
        btn.setOnClickListener {
            findNavController().navigate(R.id.action_lastFragment_to_homeFragment)
        }

        var btn2 = view.findViewById<Button>(R.id.prevbtn)
        btn2.setOnClickListener {
            findNavController().navigate(R.id.action_lastFragment_to_dataFragment)
        }

        return view
    }

}