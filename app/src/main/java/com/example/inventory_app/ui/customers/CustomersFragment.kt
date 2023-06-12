package com.example.inventory_app.ui.customers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.inventory_app.databinding.FragmentCustomersBinding

class CustomersFragment : Fragment() {

    private var _binding: FragmentCustomersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val customersViewModel =
                ViewModelProvider(this).get(CustomersViewModel::class.java)

        _binding = FragmentCustomersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCustomers
        customersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}