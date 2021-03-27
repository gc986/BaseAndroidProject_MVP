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
        lateinit var instance: BaseAndroidProjectMVP
        internal lateinit var diData: DIData
        internal lateinit var diPres: DIPres

        var showDebugInfo = true
    }

    init {
        instance = this
        diData = buildData()
        diPres = buildPres()
    }

    private fun buildData(): DIData {
        return DaggerDIData.builder()
            .dIDataModule(DIDataModule(this)).build()
    }

    private fun buildPres(): DIPres {
        return DaggerDIPres.builder()
            .dIPresModule(DIPresModule()).build()
    }

}