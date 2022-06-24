package com.bchmsl.homework4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bchmsl.homework4.databinding.ActivityProfileBinding
import com.bumptech.glide.Glide


class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        load()
        listeners()
    }

    private fun listeners() {
        binding.btnChangeProfile.setOnClickListener {
            this.makeToast("Profile picture changed :)")
        }
        binding.btnChangeUsername.setOnClickListener {
            this.makeToast("Username changed :)")
        }
        binding.btnLogOut.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }

    private fun load() {
        binding.tvName.text = intent.getStringExtra("name") ?: ""
        Glide.with(this).load("https://static.wikia.nocookie.net/tiktok/images/3/35/KhabyLamePotrait.jpeg/revision/latest?cb=20210715121242").into(binding.civProfile)
    }

}