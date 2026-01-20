package com.example.my_main_screen_bbb_impl.my_main_screen_bbb

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.compose.MyMainScreenBbbContent
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.mvi.MyMainScreenBbbAction
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.mvi.MyMainScreenBbbEvent
import com.example.my_main_screen_bbb_impl.my_main_screen_bbb.mvi.MyMainScreenBbbState
import com.example.mvi_koin_voyager.MviView
import com.example.mvi_koin_voyager.collectEvent
import kotlinx.coroutines.flow.Flow
import org.koin.compose.koinInject

internal class MyMainScreenBbb : MviView<MyMainScreenBbbAction, MyMainScreenBbbEvent, MyMainScreenBbbState> {

    @Composable
    override fun content(
        state: MyMainScreenBbbState,
        eventFlow: Flow<MyMainScreenBbbEvent>,
        pushAction: (MyMainScreenBbbAction) -> Unit
    ) {
        val navigator = LocalNavigator.currentOrThrow

        eventFlow.collectEvent { event ->
            when (event) {

            }
        }

        MyMainScreenBbbContent()
    }
}