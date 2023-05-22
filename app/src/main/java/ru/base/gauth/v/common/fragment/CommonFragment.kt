package ru.base.gauth.v.common.fragment

import androidx.fragment.app.Fragment
import moxy.MvpAppCompatFragment
import ru.gc986.logs.Logs
import javax.inject.Inject

abstract class CommonFragment(fragmentId: Int) : MvpAppCompatFragment(fragmentId), CommonFragmentView {

    var logs: Logs = Logs()

}