package dev.tanya.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import dev.tanya.mycontacts.databinding.ActivityViewContactBinding

class viewContactActivity : AppCompatActivity() {
   lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras
        var name= extras?.getString("NAME","")
        var emails= extras?.getString("EMAIL","")
        var phone=extras?.getString("PHONE_NUMBER","")
        var address=extras?.getString("ADDRESS","")

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,emails,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        Toast.makeText(this,address,Toast.LENGTH_LONG).show()

        binding.tvName2.text = name
        binding.tvEmail2.text=emails
        binding.tvAddress1.text=address
        binding.tvPhonenumber.text=phone





    }
}