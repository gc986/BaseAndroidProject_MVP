package ru.base.gauth.v.common.presenter.common

import androidx.annotation.StringRes
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import moxy.MvpPresenter
import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.gauth.m.DataCenter
import javax.inject.Inject

abstract class CommonPresImpl<T : CommonView> : CommonPres<T>, MvpPresenter<T>() {

    private val unsubscribe = CompositeDisposable()

    @Inject
    lateinit var dataCenter: DataCenter

    protected val router = BaseAndroidProjectMVP.instance.router

    protected abstract fun init()

    override fun onDestroy() {
        unsubscribe.dispose()
    }

    override fun onPause() {
    }

    override fun onStart() {
    }

    fun Disposable.addToUnsubscribe() = unsubscribe.add(this)

    protected fun getNet() = dataCenter.getNetProvider()

    protected fun getSP() = dataCenter.getSharedPref()

    fun getString(@StringRes resId: Int) = BaseAndroidProjectMVP.instance.getString(resId)

    fun getString(@StringRes resId: Int, vararg values: Any) =
        BaseAndroidProjectMVP.instance.getString(resId, *values)

}