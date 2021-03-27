package ru.base.gauth.v

import butterknife.ButterKnife
import kotlinx.android.synthetic.main.activity_main.*
import moxy.ktx.moxyPresenter
import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.R
import ru.base.gauth.p.main.MainPres
import ru.base.gauth.p.main.MainView
import ru.base.gauth.v.common.activity.CommonActivity

class MainActivity : CommonActivity(R.layout.activity_main), MainView {

    private val presenter by moxyPresenter { MainPres() }

    override fun init() {
        BaseAndroidProjectMVP.diPres.inject(this)
        ButterKnife.bind(this)
    }

    override fun initView() {
        presenter.activityOnLoaded()
    }

    override fun onShowMessage(message: String) {
        textView.text = message
    }

}
