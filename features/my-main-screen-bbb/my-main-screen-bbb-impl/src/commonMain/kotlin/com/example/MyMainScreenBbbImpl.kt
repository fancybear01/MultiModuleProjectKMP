package com.example.my_main_screen_bbb_impl

import cafe.adriel.voyager.core.screen.Screen
import com.example.my_main_screen_bbb_api.MyMainScreenBbbApi
import com.example.my_main_screen_bbb_impl.main_screen.MainScreen

internal class MyMainScreenBbbImpl : MyMainScreenBbbApi {
    override fun myMainScreenBbb(): Screen = MyMainScreenBbb()
}