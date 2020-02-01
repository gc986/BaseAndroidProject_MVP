package ru.base.gauth.di.v

import dagger.Component
import ru.base.gauth.v.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [DIPresModule::class])
interface DIPres {

    fun inject(view: MainActivity)

}