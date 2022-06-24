package com.bchmsl.homework4

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import com.bumptech.glide.Glide

fun checkFields(vararg editText: AppCompatEditText): Boolean {
    var checked = true
    editText.forEach {
        if (it.text.isNullOrEmpty()) checked = false
    }
    return checked
}

fun Context.makeToast(text:String){
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun ImageView.setPhoto(src: String){
    Glide.with(this).load(src).into(this).waitForLayout()
}