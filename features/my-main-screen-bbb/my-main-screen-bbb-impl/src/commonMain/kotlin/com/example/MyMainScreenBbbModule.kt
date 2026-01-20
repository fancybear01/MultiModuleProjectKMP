package com.example.my_main_screen_bbb_impl

import com.example.my_main_screen_bbb_api.MyMainScreenBbbApi
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.MyMainScreenBbb
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.MyMainScreenBbbModel
import com.example.mvi_koin_voyager.provideMviModel
import org.koin.dsl.module

val myMainScreenBbbModule
    get() = module {
        provideMviModel<MyMainScreenBbb> { tag, _ -> MyMainScreenBbbModel(tag, get()) }
        single<MyMainScreenBbbApi> { MyMainScreenBbbImpl() }
    }