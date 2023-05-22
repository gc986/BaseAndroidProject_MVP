package ru.base.gauth.v.main

import androidx.appcompat.widget.AppCompatButton
import com.github.terrakok.cicerone.androidx.AppNavigator
import moxy.ktx.moxyPresenter
import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.R
import ru.base.gauth.v.common.activity.CommonActivity

class MainActivity : CommonActivity(R.layout.activity_main), MainView {

    private val presenter by moxyPresenter { MainPres() }
    private val navigator = AppNavigator(this, R.id.mainContainer)

    override fun init() {
        BaseAndroidProjectMVP.diPres.inject(this)

        presenter.openFirstFragment()
    }

    override fun onResume() {
        super.onResume()
        BaseAndroidProjectMVP.instance.navigateHolder.setNavigator(navigator)
    }

    override fun onPause() {
        BaseAndroidProjectMVP.instance.navigateHolder.removeNavigator()
        super.onPause()
    }

    override fun initView() {
        presenter.activityOnLoaded()
    }

    override fun onShowMessage(message: String) {
        getDialogs().showToast(message)
    }

    fun toExit(){
        finish()
    }

}
