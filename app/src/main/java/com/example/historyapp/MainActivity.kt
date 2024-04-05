package com.example.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var checkButton: Button
    private lateinit var clearButton: Button
    private lateinit var ageInput: EditText
    private lateinit var textView: TextView

    @SuppressLint("setTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialize
        checkButton=findViewById(R.id.checkButton)
        clearButton=findViewById(R.id.clearbutton)
        ageInput=findViewById(R.id.ageInput)
        textView=findViewById(R.id.textView3)

        checkButton.setOnClickListener {
            //create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()
            var test = ""

            //if age is  not null and age is in range between 20 and 100
            if (age !=null) {
                if(age in 20..100){
                    when(age){
                        57-> test="Jan Van Riebeeck,Cape Town was founded by Jan Van Riebeeck, a Dutch colonial ruler who lived from April 21,1619, until January 18, 1677. On April 6, 1652, he anchored at the cove at the base of table mountain to establish Cape Town, the first European settlement in South Africa.Even now Cape town is refered as the Mother City. He was born in Culemborg, Netherlands. He married Maria de la Quellerie on March 28, 1649."
                        76-> test="Albert Einstein,was born in Germany theoretical physicist who is widely held as one of the greatest and influential scientist of all time, Einstein was an incredible scientist that changed the way we think about space, time and matter. his theory of relativity broke new ground in 1905 by proposing that physical laws are universal no matter what your motion is relative to them."
                        84-> test="Isaac Newton, Science was greatly advanced by Isaac Newton, who also altered the course of history he altered our understanding of gravity,space and time with the publication of his well-known book Pricipia Mathematica."
                        56-> test="Abraham Lincoln, a man of extradinary courage, honesty, and dedication to justice, is a legendary character in American history. His leadership during the tumultous years between 1861 and 1865 contributed to the develment of our country into what it is today. the words and deeds of the sixteenth US President are still remembered and honored as we study his lasting impact on the country and learn more about him. His legacy continues to speak to us."
                        52-> test="William Shakespeare,Considered to one of the greatest writers to have ever lived. Centuries after he wrote them his writings still captivate and motivate audiences everywhere, which is remarkable given that English literature had not yet reached its peak at the time whether it is through the epic romance of Romance and Juliet, the gripping vengeance story of Hamlet, or his timeless sonnets, The Bard of Avon surely left an enduring cultural legacy."
                        78-> test="Mahatma Gandhi,The revolutionary leader who altered the path of human history history.His courageous beliefs continue to act as an inspiration for civil rights movements around the world. his ideology and inspiration leadership contributed to india's freedom from British control. Gandhi's influence will last beyond our own lifetimes, spanning social justice and global freedom movements."
                        95-> test="Nelson Mandela, an outstanding leader Nelson spent his entire life battling for equality and justice. he created history as the first black president of South Africa, serving as a revolutionary against apartheid from 1994 to 1999. His leadership on the world, opening the door for freedom and multiracial democracy and acting as a constant source of inspiration for generations to come."
                        39-> test="Martin Luther King Jr, Martin Luther King Jr. His commitments to socail justice and civil rights is still strong nearly sixty years after he gave what is widely considered to be the most important speech of our time, I Have a Dream. MLK worked to eradicate racial prejudice and segregation, and his effort produced some outcomes that still motivates progress in the direction of the greater good today."
                        67-> test="George Washington, in addition he was not only the first president of America,but he also commanded the Continental Army during the American Revolution and came to represent democracy, republicanism, and leadership values forever.Even now, people honor his legacy."
                        75-> test="Leonardo da Vinci, an Italian artist inventor, was considered a genuis of his time and mostly known for his several famous works, including The Last Supper and the Mona Lisa. he was a pioneer in both engineering and anatomy due to his enthusiasm in both subjects, and many who knew him well referred to him as a Renaissance man. Leo extraordinary inventiveness is still inspiring many artist,scientist, and inventors, even decades after his death!"
                    }

                }


                //when age is 95 years display Nelson Mandela else when is .. and so on


                textView.text = if (test != "") {
                    "Your age matches $test "
                } else {
                    "No historical figure found with age entered."
                }
            } else {
                textView.text = "Invalid input. PLease enter valid age between 20 and 100"
            }
        }
        clearButton.setOnClickListener {
            ageInput.text.clear()
            textView.text = ""
            }
            

        }


    }
