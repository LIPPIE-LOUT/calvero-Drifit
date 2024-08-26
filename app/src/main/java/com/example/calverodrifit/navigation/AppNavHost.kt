package com.example.morningmobileappmvvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.calverodrifit.navigation.ROUTE_HOME
import com.example.calverodrifit.navigation.ROUTE_LOGIN
import com.example.calverodrifit.ui.theme.home.Homescreen
import com.example.calverodrifit.ui.theme.home.Login

//import com.example.morningmobileappmvvm.ui.theme.screens.clients.AddClient
//import com.example.morningmobileappmvvm.ui.theme.screens.clients.UpdateClient
//import com.example.morningmobileappmvvm.ui.theme.screens.clients.ViewClientsScreen
//import com.example.morningmobileappmvvm.ui.theme.screens.home.HomeScreens
//import com.example.morningmobileappmvvm.ui.theme.screens.login.Login
//import com.example.morningmobileappmvvm.ui.theme.screens.register.Greeting

@Composable
fun AppNavHost(
    navController: NavHostController =rememberNavController(),
    startDestination: String = ROUTE_HOME){

    NavHost(navController=navController,
        startDestination=startDestination){
        composable(ROUTE_HOME){ Homescreen(navController) }
        composable(ROUTE_LOGIN){ Login(navController)}
//        composable(ROUTE_REGISTER){ Greeting("John",navController)}
//        composable(ROUTE_ADD_CLIENT){ AddClient(navController)}
//        composable(ROUTE_VIEW_CLIENT){ ViewClientsScreen(navController)}
//        composable(ROUTE_UPDATE_CLIENT+"/{id}"){
//                passedData -> UpdateClient(
//            navController,passedData.arguments?.getString("id")!!
//        )
        }
    }
