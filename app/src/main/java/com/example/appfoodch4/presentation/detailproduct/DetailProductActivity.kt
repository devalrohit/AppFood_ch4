package com.example.appfoodch4.prensentation.detailproduct

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appfoodch4.R
import com.example.appfoodch4.databinding.ActivityCheckOutBinding
import com.example.appfoodch4.databinding.ActivityDetailsProductBinding

class DetailProductActivity : AppCompatActivity() {

    private val binding : ActivityDetailsProductBinding by lazy {
        ActivityDetailsProductBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}