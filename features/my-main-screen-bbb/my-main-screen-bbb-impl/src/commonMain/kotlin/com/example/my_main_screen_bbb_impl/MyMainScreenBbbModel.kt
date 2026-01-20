package com.example.my_main_screen_bbb_impl.my_main_screen_bbb

import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.mvi.MyMainScreenBbbAction
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.mvi.MyMainScreenBbbEffect
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.mvi.MyMainScreenBbbEvent
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.mvi.MyMainScreenBbbState
import com.example.mvi_koin_voyager.MviModel

internal class MyMainScreenBbbModel(
    tag: String
) : MviModel<MyMainScreenBbbAction, MyMainScreenBbbEffect, MyMainScreenBbbEvent, MyMainScreenBbbState>(
    defaultState = MyMainScreenBbbState,
    tag = tag,
) {
    override suspend fun bootstrap() {

    }

    override suspend fun actor(action: MyMainScreenBbbAction) {
        when (action) {

        }
    }

    override fun reducer(
        effect: MyMainScreenBbbEffect,
        previousState: MyMainScreenBbbState
    ): MyMainScreenBbbState =
        when (effect) {

        }
}