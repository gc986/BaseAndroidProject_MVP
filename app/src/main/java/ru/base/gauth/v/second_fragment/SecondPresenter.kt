package ru.base.gauth.v.second_fragment

import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.v.common.presenter.common.CommonPresImpl

class SecondPresenter: CommonPresImpl<SecondView>() {

    override fun init() {
        BaseAndroidProjectMVP.diData.inject(this)
    }

    fun toBack(){
        router.exit()
    }

}