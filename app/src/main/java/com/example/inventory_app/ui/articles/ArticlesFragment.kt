package com.example.inventory_app.ui.articles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.inventory_app.databinding.FragmentArticlesBinding

class ArticlesFragment : Fragment() {

    private var _binding: FragmentArticlesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val articlesViewModel =
                ViewModelProvider(this).get(ArticlesViewModel::class.java)

        _binding = FragmentArticlesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textArticles
        articlesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}