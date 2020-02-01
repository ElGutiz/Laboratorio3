package com.example.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityPuertoQuetzalBinding

class Puerto_Quetzal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityPuertoQuetzalBinding = DataBindingUtil.setContentView(this, R.layout.activity_puerto__quetzal)
        var model = Model()
        model.phrase = "A place where you can feel the breeze of the wet air..."
        model.title = "Puerto Quetzal: Where so many containers live."
        model.description = "Puerto Quetzal is located in the department of Escuintla, Guatemala, on the Pacific coast (Latitude 13º 55 'N; Longitude 90º 47' W); 98 km from the Capital City, it is state-owned, however, since its inception in 1983, it has successfully used a mixed system by authorizing individuals to provide certain services to the ship and cargo with tariffs set by the Company and approved by the Agreement of Government.\n" +
                "\n" + "The main dock is of the marginal type and the ships it serves are: solid bulk, container carrier, tank, gas, barge, refrigerators, general cargo, roll on - roll off, cruise ships and cargo ships other than the above." +
                "It was built in 1980 and on March 18, 1983, the Port Services were inaugurated, which began to be provided under limited conditions since the port complex was under construction. In November 1985 the first construction phase of the port is completed, the Quetzal Port is inaugurated and the Quetzal Port Company is created for its administration.\n" +
                "\n" +
                "Among its latest projects, we find the construction of a 230 m clover overpass that facilitates the vehicular flow from Puerto San José to Iztapa, two ears and tracks that facilitate the vehicular flow from Guatemala to Puerto San José - Iztapa in both directions, and a circle that facilitates the vehicular flow from Puerto Quetzal to San José - Iztapa.\n" +
                "\n" +
                "Puerto Quetzal continues day by day with its ranges of services to meet the needs of its customers and the country's exports and imports." + "\n" + "\n" + "Wikipedia"
        binding.model = model


        val comentario = findViewById<EditText>(R.id.final_comment)
        val sub_coment = findViewById<Button>(R.id.sub_comment)

        sub_coment.setOnClickListener {
            val comment_final = comentario.text.toString()

            val main = Intent(this@Puerto_Quetzal, MainActivity::class.java)
            main.putExtra("Comentario_final", comment_final)
            startActivity(main)
        }
    }
}
