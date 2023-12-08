package com.example.roomdatabase.ui.ui.halaman

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.roomdatabase.repositori.RepositoriSiswa

class DetailsViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
) : ViewModel(){

    private val siswaId: Int = checkNotNull(savedStateHandle[DetailsDestination.siswaIdArg])
}