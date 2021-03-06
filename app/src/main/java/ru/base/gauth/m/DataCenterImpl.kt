package ru.base.gauth.m

import android.content.Context
import ru.base.dataprovider.net.RequestsI
import ru.base.dataprovider.net.RequestsImpl
import ru.base.dataprovider.sharPref.SharedPreferencesHelper
import ru.base.dataprovider.sharPref.SharedPreferencesHelperImpl
import ru.base.gauth.BaseAndroidProjectMVP
import ru.base.models.Consts

class DataCenterImpl(private val context: Context): DataCenter {

    private var requests: RequestsImpl? = null
    private var mainServerUrl: String? = null
    private val sharedPref: SharedPreferencesHelper = SharedPreferencesHelperImpl(context)

    override fun setMainServerUrl(mainServer: String) {
        if (mainServer.isEmpty())
            throw NullPointerException("Url server must not be null")
        val fullMainServerUrl = if (mainServer.last().toString() != "/")
            "$mainServer/"
        else
            mainServer
        mainServerUrl = fullMainServerUrl
        requests?.setMainServer(fullMainServerUrl)

        getSharedPref().putSPString(Consts.SERVERADDRESS, fullMainServerUrl).subscribe {}
    }

    private fun getMainServerUrl(): String = mainServerUrl?.let { it } ?: let {
        var url = ""
        getSharedPref().getSPString(Consts.SERVERADDRESS).subscribe { url = it }
        mainServerUrl = url
        return url
    }

    private fun getRequests(): RequestsImpl = requests ?: let {
        val newRequests = RequestsImpl(context, ru.base.gauth.BaseAndroidProjectMVP.showDebugInfo)
        newRequests.setMainServer(getMainServerUrl())
        requests = newRequests
        return newRequests
    }

    override fun getNetProvider(): RequestsI = getRequests()

    override fun getSharedPref(): SharedPreferencesHelper = sharedPref
}