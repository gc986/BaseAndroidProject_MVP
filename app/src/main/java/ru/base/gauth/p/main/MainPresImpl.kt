package ru.base.gauth.p.main

import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.p.common.CommonPresImpl

class MainPresImpl: CommonPresImpl<MainView>(), MainPres {

    override fun init() {
        ru.base.gauth.BaseAndroidProjectMVP.diData.inject(this)
    }

}