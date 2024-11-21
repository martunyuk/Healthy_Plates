package com.themeal.app.presentation.fragment.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeFragmentViewModel : ViewModel() {

    private val _recyclerScrollPositionLive = MutableLiveData<Pair<Int, Int>>()
    val recyclerScrollPositionLive: LiveData<Pair<Int, Int>> = _recyclerScrollPositionLive

    fun saveRecyclerScrollPosition(position: Int, offset: Int) {
        _recyclerScrollPositionLive.value = position to offset
    }
}