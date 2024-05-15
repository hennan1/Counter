package com.example.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _repository : CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    val count : MutableState<Int> = (_count)

    fun inc(){
        _repository.modelInc()
        _count.value = _repository.getCounter().count
    }

    fun dec(){
        _repository.modelDec()
        _count.value = _repository.getCounter().count
    }

}