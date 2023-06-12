package com.example.inventory_app.ui.sales

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.inventory_app.databinding.FragmentSalesBinding

class SalesFragment : Fragment() {

    private var _binding: FragmentSalesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val salesViewModel =
                ViewModelProvider(this).get(SalesViewModel::class.java)

        _binding = FragmentSalesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSales
        salesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}