package com.example.inventory_app.ui.purchases

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.inventory_app.databinding.FragmentPurchasesBinding

class PurchasesFragment : Fragment() {

    private var _binding: FragmentPurchasesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val purchasesViewModel =
                ViewModelProvider(this).get(PurchasesViewModel::class.java)

        _binding = FragmentPurchasesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPurchases
        purchasesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}