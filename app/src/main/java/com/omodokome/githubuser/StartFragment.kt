package com.omodokome.githubuser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.omodokome.githubuser.databinding.FragmentStartBinding
import com.omodokome.user_presentation.databinding.FragmentUserBinding

class StartFragment : Fragment() {
    private var _binding: FragmentStartBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.btnProceed.setOnClickListener {
//           findNavController().navigate(R.id.action_startFragment_to_user_nav_graph)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}