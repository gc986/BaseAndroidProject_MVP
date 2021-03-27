package ru.base.gauth.p.main

import moxy.viewstate.strategy.alias.AddToEndSingle
import ru.base.gauth.p.common.CommonView

interface MainView: CommonView {

    @AddToEndSingle
    fun onShowMessage(message: String)

}