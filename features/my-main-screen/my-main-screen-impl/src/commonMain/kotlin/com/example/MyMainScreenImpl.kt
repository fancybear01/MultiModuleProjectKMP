package com.example.my_main_screen_impl

import cafe.adriel.voyager.core.screen.Screen
import com.example.my_main_screen_api.MyMainScreenApi
import com.example.my_main_screen_impl.main_screen.MainScreen

internal class MyMainScreenImpl : MyMainScreenApi {
    override fun myMainScreen(): Screen = MyMainScreen()
}