package com.example.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _count = mutableStateOf(0 )

    val count: MutableState<Int> = _count

    fun increment(){
        count.value++
    }
    fun decrement(){
        count.value--
    }
}