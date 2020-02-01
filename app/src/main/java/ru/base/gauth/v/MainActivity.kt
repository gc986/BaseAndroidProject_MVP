package ru.base.gauth.v

import butterknife.ButterKnife
import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.R
import ru.base.gauth.p.main.MainPres
import ru.base.gauth.p.main.MainView
import ru.base.gauth.v.common.activity.CommonActivity

class MainActivity : CommonActivity<MainPres>(), MainView {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun init() {
        ButterKnife.bind(this)
        BaseAndroidProjectMVP.diPres.inject(this)
        getP().setup(this)
    }

    override fun initView() {

    }

}
