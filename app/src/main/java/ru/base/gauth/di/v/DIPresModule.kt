package ru.base.gauth.di.v

import dagger.Module
import dagger.Provides
import ru.base.gauth.p.main.MainPres
import ru.base.gauth.p.main.MainPresImpl

@Module
class DIPresModule {

    @Provides fun provideMainPres(): MainPres = MainPresImpl()

}