package com.example.inventory_app.ui.providers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProvidersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is providers Fragment"
    }
    val text: LiveData<String> = _text
}