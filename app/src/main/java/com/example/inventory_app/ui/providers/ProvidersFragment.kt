package com.example.inventory_app.ui.providers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.inventory_app.databinding.FragmentProvidersBinding

class ProvidersFragment : Fragment() {

    private var _binding: FragmentProvidersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val providersViewModel =
                ViewModelProvider(this).get(ProvidersViewModel::class.java)

        _binding = FragmentProvidersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textProviders
        providersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}