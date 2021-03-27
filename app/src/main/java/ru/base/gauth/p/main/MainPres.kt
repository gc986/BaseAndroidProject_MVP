package ru.base.gauth.p.main

import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.R
import ru.base.gauth.p.common.CommonPresImpl

class MainPres : CommonPresImpl<MainView>() {

    override fun init() {
        BaseAndroidProjectMVP.diData.inject(this)
    }

    fun activityOnLoaded() {
        var ddd = getString(R.string.hello_world)
        ddd = getString(R.string.hello_world)
        viewState.onShowMessage(ddd)
    }

}