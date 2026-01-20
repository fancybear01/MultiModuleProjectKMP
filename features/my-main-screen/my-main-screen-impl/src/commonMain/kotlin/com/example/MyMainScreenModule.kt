package com.example.my_main_screen_impl

import com.example.my_main_screen_api.MyMainScreenApi
import com.example.my_main_screen_impl.my_main_screen.MyMainScreen
import com.example.my_main_screen_impl.my_main_screen.MyMainScreenModel
import com.example.mvi_koin_voyager.provideMviModel
import org.koin.dsl.module

val myMainScreenModule
    get() = module {
        provideMviModel<MyMainScreen> { tag, _ -> MyMainScreenModel(tag, get()) }
        single<MyMainScreenApi> { MyMainScreenImpl() }
    }