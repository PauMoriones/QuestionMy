package cat.urv.deim.asm.exemple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        findViewById<Button>(R.id.questions_submit_button).setOnClickListener {
            val intent: Intent = Intent()
            intent.setClass(this,QuestionsActivity::class.java)
            intent.putExtra("SCORE",5)
            this.startActivity(intent)
            //jdgjdfhdj
        }
    }
}