package com.example.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityLagoAtitlanBinding

class Lago_Atitlan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLagoAtitlanBinding = DataBindingUtil.setContentView(this, R.layout.activity_lago__atitlan)
        var model = Model()
        model.phrase = "Let the peace and the beauty of the nature take you to a wonderful trip."
        model.title = "Lago de Atitlan: Wonderful Views"
        model.description = "It is a lake in the Guatemalan Highlands of the Sierra Madre mountain range. It is in the Sololá Department of southwestern Guatemala. It is the deepest lake in Central America." +
                "Atitlán means \"between the waters\". In the Nahuatl language, \"atl\" is the word for water, and \"titlan\" means between. The \"tl\" at the end of the word \"atl\" is dropped and the words are combined to form \"Atitlán\"." +
                "\n" + "\n" + "Atitlán is technically an endorheic lake, feeding into two nearby rivers rather than draining into the ocean. It is shaped by deep surrounding escarpments and three volcanoes on its southern flank. The lake basin is volcanic in origin, filling an enormous caldera formed by an eruption 84,000 years ago. The culture of the towns and villages surrounding Lake Atitlán is influenced by the Maya people. The lake is about 50 kilometres (31 mi) west-northwest of Antigua. It should not be confused with the smaller Lake Amatitlán." +
                "\n" + "\n" + "Lake Atitlán is renowned as one of the most beautiful lakes in the world, and is Guatemala's most important national and international tourist attraction. German explorer and naturalist Alexander von Humboldt called it \"the most beautiful lake in the world,\" and Aldous Huxley famously wrote of it in his 1934 travel book Beyond the Mexique Bay: \"Lake Como, it seems to me, touches on the limit of permissibly picturesque, but Atitlán is Como with additional embellishments of several immense volcanoes. It really is too much of a good thing.\"" +
                "\n" + "\n" + "Wikipedia"
        binding.model = model

        val comentario = findViewById<EditText>(R.id.final_comment)
        val sub_coment = findViewById<Button>(R.id.sub_comment)

        sub_coment.setOnClickListener {
            val comment_final = comentario.text.toString()

            val main = Intent(this@Lago_Atitlan, MainActivity::class.java)
            main.putExtra("Comentario_final", comment_final)
            startActivity(main)
        }
    }
}
