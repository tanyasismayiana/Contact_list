package dev.tanya.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import dev.tanya.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact = Contact("Tanyasis","0713242829","tanya@mail.com","korong45","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTsHtePTQxIZ1yGo2trY40fkM4PClR127OzpA&usqp=CAU")
        var contact1 = Contact("Mayiana","075566678","mayiana@mail.com","ngong45","https://images.pexels.com/photos/3280901/pexels-photo-3280901.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
        var contact2 = Contact("Juliet","071677779","juliet@mail.com","zimmerman34","https://images.pexels.com/photos/5112014/pexels-photo-5112014.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load")
        var contact3 = Contact("Jane","0776678899","tanya@mail.com","kahawa-west","https://images.pexels.com/photos/4350112/pexels-photo-4350112.jpeg?auto=compress&cs=tinysrgb&w=600")

        var contactList= listOf(contact,contact1,contact2,contact3)
        var contactAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter





    }
}