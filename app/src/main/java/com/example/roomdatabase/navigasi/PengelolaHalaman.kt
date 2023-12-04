package com.example.roomdatabase.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.roomdatabase.ui.ui.halaman.DestinasiEntry
import com.example.roomdatabase.ui.ui.halaman.DestinasiHome
import com.example.roomdatabase.ui.ui.halaman.EntrySiswaScreen
import com.example.roomdatabase.ui.ui.halaman.HomeScreen

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination = DestinasiHome.route, modifier = Modifier){
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route)})
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
    }
}