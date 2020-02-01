package ru.base.gauth.m

import ru.base.dataprovider.net.RequestsI
import ru.base.dataprovider.sharPref.SharedPreferencesHelper

interface DataCenter {

    fun setMainServerUrl(mainServer: String)
    fun getNetProvider(): RequestsI
    fun getSharedPref(): SharedPreferencesHelper

}