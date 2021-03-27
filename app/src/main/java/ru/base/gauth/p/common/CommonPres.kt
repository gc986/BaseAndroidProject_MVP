package ru.base.gauth.p.common

interface CommonPres<T : CommonView> {

    fun onDestroy()
    fun onPause()
    fun onStart()

}