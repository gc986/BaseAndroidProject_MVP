package ru.base.gauth.v

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.base.gauth.v.first_fragment.FirstFragment
import ru.base.gauth.v.second_fragment.SecondFragment

object Screens {

    fun firstScreen() = FragmentScreen { FirstFragment() }

    fun secondScreen() = FragmentScreen { SecondFragment() }

}