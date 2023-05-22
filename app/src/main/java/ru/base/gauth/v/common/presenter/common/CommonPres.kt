package ru.base.gauth.v.common.presenter.common

interface CommonPres<T : CommonView> {

    fun onDestroy()
    fun onPause()
    fun onStart()

}