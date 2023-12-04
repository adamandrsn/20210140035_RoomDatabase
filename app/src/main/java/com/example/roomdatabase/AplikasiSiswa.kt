package com.example.roomdatabase

import android.app.Application
import com.example.roomdatabase.repositori.ContainerDataApp

class AplikasiSiswa: Application() {
    lateinit var container: ContainerDataApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}