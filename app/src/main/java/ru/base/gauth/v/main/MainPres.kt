package ru.base.gauth.v.main

import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.R
import ru.base.gauth.v.Screens
import ru.base.gauth.v.common.presenter.common.CommonPresImpl

class MainPres : CommonPresImpl<MainView>() {

    override fun init() {
        BaseAndroidProjectMVP.diData.inject(this)
    }

    fun activityOnLoaded() {
        viewState.onShowMessage(getString(R.string.hello_world))
    }

    fun openFirstFragment(){
        router.navigateTo(Screens.firstScreen())
    }

}