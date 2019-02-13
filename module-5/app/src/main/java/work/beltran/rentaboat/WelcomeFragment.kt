package work.beltran.rentaboat

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.NavUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_welcome.view.*


class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        view.findViewById<Button>(R.id.button_login).setOnClickListener {
            val email = view.editTextEmail.text.toString()
            val password = view.editTextPassword.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {
                findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
            }
        }

        view.findViewById<Button>(R.id.button_registration).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_registrationFragment)
        )

        return view
    }
}
