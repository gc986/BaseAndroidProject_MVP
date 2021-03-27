package ru.base.gauth.di.p

import dagger.Component
import ru.base.gauth.p.main.MainPres
import javax.inject.Singleton

@Singleton
@Component(modules = [DIDataModule::class])
interface DIData {

    fun inject(presenter: MainPres)

}