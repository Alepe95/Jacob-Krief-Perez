package com.example.alexis.trombinoscope;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by natkr on 11/02/2019.
 */

public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(Context context, List<Person> persons) {
        super(context, 0, persons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.liste_personne, parent, false);
        }

        PersonItemHolder viewHolder = (PersonItemHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new PersonItemHolder();
            viewHolder.firstName = (TextView) convertView.findViewById(R.id.firstName);
            viewHolder.lastName = (TextView) convertView.findViewById(R.id.lastName);
            viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Person person = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        Log.i("ICI", person.getNom());
        //viewHolder.firstName.setText(person.getNom());
        //viewHolder.lastName.setText(person.getPrenom());
        //viewHolder.avatar.setImageDrawable(new ColorDrawable(person.getAvatarColor()));

        return convertView;
    }
}