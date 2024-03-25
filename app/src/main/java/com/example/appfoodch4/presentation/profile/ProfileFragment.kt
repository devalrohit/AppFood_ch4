package com.example.appfoodch4.prensentation.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import com.example.appfoodch4.R
import com.example.appfoodch4.databinding.ActivityDetailsProductBinding
import com.example.appfoodch4.databinding.FragmentHomeBinding
import com.example.appfoodch4.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {


    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}