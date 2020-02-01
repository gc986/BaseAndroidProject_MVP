package ru.base.gauth.di.p

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.base.gauth.m.DataCenter
import ru.base.gauth.m.DataCenterImpl
import javax.inject.Singleton

@Module
class DIDataModule(internal var context: Context) {

    @Provides
    @Singleton
    fun provideRequests(): DataCenter = DataCenterImpl(context)

}