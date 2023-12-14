package com.example.roomdatabase.ui.model

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomdatabase.AplikasiSiswa
import com.example.roomdatabase.model.DetailsViewModel
import com.example.roomdatabase.model.EditViewModel
import com.example.roomdatabase.model.EntryViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            DetailsViewModel(
                createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa,
            )
        }
        initializer {
            EditViewModel(
                createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa,
            )
        }
    }
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)