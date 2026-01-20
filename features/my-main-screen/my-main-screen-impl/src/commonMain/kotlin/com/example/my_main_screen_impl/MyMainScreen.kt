package com.example.my_main_screen_impl.my_main_screen

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.my_main_screen_impl.my_main_screen.compose.MyMainScreenContent
import com.example.my_main_screen_impl.my_main_screen.mvi.MyMainScreenAction
import com.example.my_main_screen_impl.my_main_screen.mvi.MyMainScreenEvent
import com.example.my_main_screen_impl.my_main_screen.mvi.MyMainScreenState
import com.example.mvi_koin_voyager.MviView
import com.example.mvi_koin_voyager.collectEvent
import kotlinx.coroutines.flow.Flow
import org.koin.compose.koinInject

internal class MyMainScreen : MviView<MyMainScreenAction, MyMainScreenEvent, MyMainScreenState> {

    @Composable
    override fun content(
        state: MyMainScreenState,
        eventFlow: Flow<MyMainScreenEvent>,
        pushAction: (MyMainScreenAction) -> Unit
    ) {
        val navigator = LocalNavigator.currentOrThrow

        eventFlow.collectEvent { event ->
            when (event) {

            }
        }

        MyMainScreenContent()
    }
}