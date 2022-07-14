package dev.tanya.mycontacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.tanya.mycontacts.databinding.ContactListItemBinding

class ContactRvAdapter(var contactList: List<Contact>) :
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val context=holder.itemView.context
        var currentContact = contactList.get(position)
        with(holder.binding) {
            val contatctBinding = holder.binding
            contatctBinding.tvAddress.text = currentContact.address
            contatctBinding.tvEmail.text = currentContact.email
            contatctBinding.tvNumber.text = currentContact.number
            contatctBinding.tvName.text = currentContact.name

            Picasso.get()
                .load(currentContact.image)
                .resize(300,300)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_person_24)
                .error(R.drawable.ic_baseline_person_24)
                .into(contatctBinding.imgContact)

            cvContact.setOnClickListener {
                val context=holder.itemView.context
                val intent=Intent(context,viewContactActivity::class.java)
                intent.putExtra("NAME",currentContact.name)
                intent.putExtra("EMAIL",currentContact.email)
                intent.putExtra("PHONE_NUMBER",currentContact.number)
                intent.putExtra("ADDRESS",currentContact.address)

                context.startActivity(intent)

            }
           holder.binding. imgContact.setOnClickListener{
                Toast.makeText(context,"You have clicked on the image",Toast.LENGTH_LONG)
                    .show()
            }
            
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(var binding: ContactListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {


//    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
//    var tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
//    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//    var imgContact = itemView.findViewById<ImageView>(R.id.imgContact)
}