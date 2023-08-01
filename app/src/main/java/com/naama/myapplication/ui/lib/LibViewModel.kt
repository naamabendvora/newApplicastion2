package com.naama.myapplication.ui.lib

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LibViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is lib Fragment"
    }
    val text: LiveData<String> = _text
}