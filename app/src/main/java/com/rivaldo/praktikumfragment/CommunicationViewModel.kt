package com.rivaldo.praktikumfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//class CommunicationViewModel di extends dari class ViewModel
class CommunicationViewModel : ViewModel() {
    //buat variable Live data berupa String
    private val mName = MutableLiveData<String>()

    //membuat variable live data berupa string
    val name: LiveData<String>
    //method untuk get nama dari CommunicationViewModel
    get() = mName
    //method untuk melakukan set nama yang akan diisikan ke mName
    fun setName(name: String ){
        mName.value = name
    }
}