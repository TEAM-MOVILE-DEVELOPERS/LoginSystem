package com.juancho1037.umadefodds.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.juancho1037.umadefodds.R
import com.juancho1037.umadefodds.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerBinding.root)

        with(registerBinding){
            registerButton.setOnClickListener{
                val complete_name = fullnameEditText.text.toString()
                val email = emailEditText.text.toString()
                val password = passwordEditText.text.toString()
                val repeatPassword = repeatPassordEditText.text.toString()

                if (password == repeatPassword){
                    val intent = Intent(this@RegisterActivity, LoginActivity::class:java)
                    intent.putExtra("email",email)
                    intent.putExtra("password",password)
                    startActivity(intent)

                }else
                    Toast.makeText(applicationContext, "Las contraseñas deben ser iguales", Toast.LENGTH_SHORT).show()
            }
        }
    }
}