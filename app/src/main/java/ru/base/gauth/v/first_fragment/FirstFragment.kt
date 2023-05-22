package ru.base.gauth.v.first_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.ktx.moxyPresenter
import ru.base.gauth.R
import ru.base.gauth.databinding.FirstFragmentBinding
import ru.base.gauth.v.common.fragment.CommonFragment
import ru.base.gauth.v.main.MainActivity
import ru.base.gauth.v.main.MainPres

class FirstFragment: CommonFragment(R.layout.first_fragment) {

    private lateinit var binding: FirstFragmentBinding

    private val pres by moxyPresenter { FirstPresenter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.openSecondFragment.setOnClickListener {
            pres.openSecondFragment()
        }

        binding.exitFromApp.setOnClickListener {
            (requireActivity() as MainActivity).toExit()
        }
    }

}