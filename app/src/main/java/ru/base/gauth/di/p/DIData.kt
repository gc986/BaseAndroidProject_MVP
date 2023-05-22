package ru.base.gauth.di.p

import dagger.Component
import ru.base.gauth.v.first_fragment.FirstPresenter
import ru.base.gauth.v.main.MainPres
import ru.base.gauth.v.second_fragment.SecondPresenter
import javax.inject.Singleton

@Singleton
@Component(modules = [DIDataModule::class])
interface DIData {

    fun inject(presenter: MainPres)
    fun inject(presenter: FirstPresenter)
    fun inject(presenter: SecondPresenter)

}