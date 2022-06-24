package com.bchmsl.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bchmsl.homework4.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        listeners()
    }

    private fun listeners() {
        binding.btnNext.setOnClickListener {
            if (checkFields(binding.etFullName, binding.etUsername)){
                val intent = Intent(this, SignupPasswordActivity::class.java)
                intent.putExtra("name", binding.etFullName.text.toString())
                startActivity(intent)
            }else{
                this.makeToast("Check fields and try again!")
            }
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}