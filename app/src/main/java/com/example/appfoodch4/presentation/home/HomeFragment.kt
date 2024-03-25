package com.example.appfoodch4.prensentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appfoodch4.R
import com.example.appfoodch4.databinding.FragmentCartBinding
import com.example.appfoodch4.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}