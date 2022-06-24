package com.bchmsl.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bchmsl.homework4.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        listeners()
    }

    private fun listeners() {
        binding.btnSignIn.setOnClickListener {
            if (checkFields(binding.etUsername, binding.etPassword)) {
                this.makeToast("Signed in by ${binding.etUsername.text}")
            }else{
                this.makeToast("Check fields and try again!")
            }
        }

        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        binding.tvForgotPassword.setOnClickListener {
            this.makeToast("Try to remember :)")
        }
    }
}