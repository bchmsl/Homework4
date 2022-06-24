package com.bchmsl.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bchmsl.homework4.databinding.ActivitySignupPasswordBinding

class SignupPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        setText()
        listeners()
    }

    private fun setText() {
        val intent = intent.getStringExtra("name") ?: ""
        binding.tvName.text = intent
    }

    private fun listeners() {
        binding.btnNext.setOnClickListener {
            if (!binding.etPassword.text.isNullOrEmpty() && !binding.etRepeatPassword.text.isNullOrEmpty()) {
                if (binding.etPassword.text.toString() == binding.etRepeatPassword.text.toString()) {
                    this.makeToast("Sign up successfully!")
                } else {
                    this.makeToast("Passwords do not match!")
                }
            } else {
                this.makeToast("Check fields and try again!")
            }
        }
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}