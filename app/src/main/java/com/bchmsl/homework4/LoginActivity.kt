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

                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("name", binding.etUsername.text.toString())
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)

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