package ru.base.gauth.v.first_fragment

import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.v.Screens
import ru.base.gauth.v.common.presenter.common.CommonPresImpl

class FirstPresenter: CommonPresImpl<FirstView>() {
    override fun init() {
        BaseAndroidProjectMVP.diData.inject(this)
    }

    fun openSecondFragment(){
        router.navigateTo(Screens.secondScreen())
    }

}