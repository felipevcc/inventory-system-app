package com.example.inventory_app.ui.customers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CustomersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is customers Fragment"
    }
    val text: LiveData<String> = _text
}