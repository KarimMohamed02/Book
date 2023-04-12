package com.example.bookv01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class listImages extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_images);
        listView = findViewById(R.id.listView);
        ArrayList<com.example.bookv01.Person> arrayList = new ArrayList<>();

        arrayList.add(new com.example.bookv01.Person(R.drawable.art01,"Leonardo da Vinci by Walter Isaacson","Based on thousands of pages from Leonardo's astonishing notebooks and new discoveries about his life and work, Walter Isaacson weaves a narrative that connects his art to his science. He shows how Leonardo's genius was based on skills we can improve in ourselves, such as passionate curiosity, careful observation, and an imagination so playful that it flirted with fantasy. He produced the two most famous paintings in history, The Last Supper and the Mona Lisa."));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art02,"Leonardo da Vinci by Walter Isaacson","Based on thousands of pages from Leonardo's astonishing notebooks and new discoveries about his life and work, Walter Isaacson weaves a narrative that connects his art to his science.  "));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art03,"Vincent Van Gogh: The Complete Paintings by Rainer Metzger","With precisely 35 canvases to his credit, the Dutch painter Johannes Vermeer represents one of the great enigmas of 17th-century art. "));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art04,"Girl with a Pearl Earring by Tracy Chevalier","Van Gogh, who took up a variety of professions before becoming an artist, was a solitary, despairing and self-destructive man."));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art05,"The Lives of the Artists by Giorgio Vasari","Packed with facts, attributions, and entertaining anecdotes about his contemporaries, Giorgio Vasari's collection of biographical accounts also presents a highly influential theory of the development of Renaissance art."));


        arrayList.add(new Person(R.drawable.business01,"Rework by Jason Fried","Most business books give you the same old advice: Write a business plan, study the competition, seek investors, yadda yadda. If you're looking for a book like that, put this one back on the shelf."));
        arrayList.add(new Person(R.drawable.business02,"The Five Dysfunctions of a Team: A Leadership Fable"," In The Five Dysfunctions of a Team Patrick Lencioni once again offers a leadership fable that is as enthralling and instructive as his first two best-selling books, The Five Temptations of a CEO and The Four Obsessions of an Extraordinary Executive"));
        arrayList.add(new Person(R.drawable.business03,"The Intelligent Investor by Benjamin Graham"," The Classic Text Annotated to Update Graham's Timeless Wisdom for Today's Market Conditions "));
        arrayList.add(new Person(R.drawable.business04,"Thinking, Fast and Slow by Daniel Kahneman","In the highly anticipated Thinking, Fast and Slow, Kahneman takes us on a groundbreaking tour of the mind and explains the two systems that drive the way we think.  "));
        arrayList.add(new Person(R.drawable.business05,"Business Adventures","What do the $350 million Ford Motor Company disaster known as the Edsel, the fast and incredible rise of Xerox, and the unbelievable scandals at General Electric and Texas Gulf Sulphur have in common? "));

        arrayList.add(new Person(R.drawable.business01,"Rework by Jason Fried","Most business books give you the same old advice: Write a business plan, study the competition, seek investors, yadda yadda. If you're looking for a book like that, put this one back on the shelf."));
        arrayList.add(new Person(R.drawable.business02,"The Five Dysfunctions of a Team: A Leadership Fable"," In The Five Dysfunctions of a Team Patrick Lencioni once again offers a leadership fable that is as enthralling and instructive as his first two best-selling books, The Five Temptations of a CEO and The Four Obsessions of an Extraordinary Executive"));
        arrayList.add(new Person(R.drawable.business03,"The Intelligent Investor by Benjamin Graham"," The Classic Text Annotated to Update Graham's Timeless Wisdom for Today's Market Conditions "));
        arrayList.add(new Person(R.drawable.business04,"Thinking, Fast and Slow by Daniel Kahneman","In the highly anticipated Thinking, Fast and Slow, Kahneman takes us on a groundbreaking tour of the mind and explains the two systems that drive the way we think.  "));
        arrayList.add(new Person(R.drawable.business05,"Business Adventures","What do the $350 million Ford Motor Company disaster known as the Edsel, the fast and incredible rise of Xerox, and the unbelievable scandals at General Electric and Texas Gulf Sulphur have in common? "));

        arrayList.add(new Person(R.drawable.business01,"Rework by Jason Fried","Most business books give you the same old advice: Write a business plan, study the competition, seek investors, yadda yadda. If you're looking for a book like that, put this one back on the shelf."));
        arrayList.add(new Person(R.drawable.business02,"The Five Dysfunctions of a Team: A Leadership Fable"," In The Five Dysfunctions of a Team Patrick Lencioni once again offers a leadership fable that is as enthralling and instructive as his first two best-selling books, The Five Temptations of a CEO and The Four Obsessions of an Extraordinary Executive"));
        arrayList.add(new Person(R.drawable.business03,"The Intelligent Investor by Benjamin Graham"," The Classic Text Annotated to Update Graham's Timeless Wisdom for Today's Market Conditions "));
        arrayList.add(new Person(R.drawable.business04,"Thinking, Fast and Slow by Daniel Kahneman","In the highly anticipated Thinking, Fast and Slow, Kahneman takes us on a groundbreaking tour of the mind and explains the two systems that drive the way we think.  "));
        arrayList.add(new Person(R.drawable.business05,"Business Adventures","What do the $350 million Ford Motor Company disaster known as the Edsel, the fast and incredible rise of Xerox, and the unbelievable scandals at General Electric and Texas Gulf Sulphur have in common? "));

        arrayList.add(new com.example.bookv01.Person(R.drawable.art01,"Business Adventures","With precisely 35 canvases to his credit, the Dutch painter Johannes Vermeer represents one of the great enigmas of 17th-century art. "));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art02,"Leonardo da Vinci by Walter Isaacson","Based on thousands of pages from Leonardo's astonishing notebooks and new discoveries about his life and work, Walter Isaacson weaves a narrative that connects his art to his science.  "));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art03,"Vincent Van Gogh: The Complete Paintings by Rainer Metzger","With precisely 35 canvases to his credit, the Dutch painter Johannes Vermeer represents one of the great enigmas of 17th-century art. "));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art04,"Girl with a Pearl Earring by Tracy Chevalier","Van Gogh, who took up a variety of professions before becoming an artist, was a solitary, despairing and self-destructive man."));
        arrayList.add(new com.example.bookv01.Person(R.drawable.art05,"The Lives of the Artists by Giorgio Vasari","Packed with facts, attributions, and entertaining anecdotes about his contemporaries, Giorgio Vasari's collection of biographical accounts also presents a highly influential theory of the development of Renaissance art."));

        //we make custom adapter

        PersonAdapter personAdapter  = new PersonAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(personAdapter);

    }
}