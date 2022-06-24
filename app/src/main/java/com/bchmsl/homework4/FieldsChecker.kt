package com.bchmsl.homework4

import android.content.Context
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

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