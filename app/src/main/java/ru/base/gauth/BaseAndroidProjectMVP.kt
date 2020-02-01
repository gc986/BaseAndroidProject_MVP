package ru.base.gauth

import android.app.Application
import ru.base.gauth.di.p.DIData
import ru.base.gauth.di.p.DIDataModule
import ru.base.gauth.di.p.DaggerDIData
import ru.base.gauth.di.v.DIPres
import ru.base.gauth.di.v.DIPresModule
import ru.base.gauth.di.v.DaggerDIPres

class BaseAndroidProjectMVP: Application() {

    companion object{
        lateinit var instance: ru.base.gauth.BaseAndroidProjectMVP
        internal lateinit var diData: DIData
        internal lateinit var diPres: DIPres

        var showDebugInfo = true
    }

    init {
        ru.base.gauth.BaseAndroidProjectMVP.Companion.instance = this
        ru.base.gauth.BaseAndroidProjectMVP.Companion.diData = buildData()
        ru.base.gauth.BaseAndroidProjectMVP.Companion.diPres = buildPres()
    }

    private fun buildData(): DIData {
        return ru.base.gauth.di.p.DaggerDIData.builder()
            .dIDataModule(DIDataModule(this)).build()
    }

    private fun buildPres(): DIPres {
        return ru.base.gauth.di.v.DaggerDIPres.builder()
            .dIPresModule(DIPresModule()).build()
    }

}