package com.example.my_main_screen_impl.my_main_screen

import com.example.my_main_screen_impl.my_main_screen.mvi.MyMainScreenAction
import com.example.my_main_screen_impl.my_main_screen.mvi.MyMainScreenEffect
import com.example.my_main_screen_impl.my_main_screen.mvi.MyMainScreenEvent
import com.example.my_main_screen_impl.my_main_screen.mvi.MyMainScreenState
import com.example.mvi_koin_voyager.MviModel

internal class MyMainScreenModel(
    tag: String
) : MviModel<MyMainScreenAction, MyMainScreenEffect, MyMainScreenEvent, MyMainScreenState>(
    defaultState = MyMainScreenState,
    tag = tag,
) {
    override suspend fun bootstrap() {

    }

    override suspend fun actor(action: MyMainScreenAction) {
        when (action) {

        }
    }

    override fun reducer(
        effect: MyMainScreenEffect,
        previousState: MyMainScreenState
    ): MyMainScreenState =
        when (effect) {

        }
}