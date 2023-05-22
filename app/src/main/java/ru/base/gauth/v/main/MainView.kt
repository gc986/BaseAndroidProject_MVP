package ru.base.gauth.v.main

import moxy.viewstate.strategy.alias.AddToEndSingle
import ru.base.gauth.v.common.presenter.common.CommonView

interface MainView: CommonView {

    @AddToEndSingle
    fun onShowMessage(message: String)

}