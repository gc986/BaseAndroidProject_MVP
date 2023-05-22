package ru.base.gauth.v.second_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.ktx.moxyPresenter
import ru.base.gauth.R
import ru.base.gauth.databinding.SecondFragmentBinding
import ru.base.gauth.v.common.fragment.CommonFragment

class SecondFragment : CommonFragment(R.layout.second_fragment) {

    private lateinit var binding: SecondFragmentBinding
    private val pres by moxyPresenter { SecondPresenter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SecondFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toBack.setOnClickListener {
            pres.toBack()
        }
    }

}